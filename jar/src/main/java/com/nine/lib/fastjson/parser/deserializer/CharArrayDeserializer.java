package com.nine.lib.fastjson.parser.deserializer;

import java.lang.reflect.Type;

import com.nine.lib.fastjson.JSON;
import com.nine.lib.fastjson.parser.DefaultJSONParser;
import com.nine.lib.fastjson.parser.JSONScanner;
import com.nine.lib.fastjson.parser.JSONToken;

public class CharArrayDeserializer implements ObjectDeserializer {

    public final static CharArrayDeserializer instance = new CharArrayDeserializer();

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {
        return (T) deserialze(parser);
    }
    
    @SuppressWarnings("unchecked")
    public static <T> T deserialze(DefaultJSONParser parser) {
        final JSONScanner lexer = parser.getLexer();
        if (lexer.token() == JSONToken.LITERAL_STRING) {
            String val = lexer.stringVal();
            lexer.nextToken(JSONToken.COMMA);
            return (T) val.toCharArray();
        }
        
        if (lexer.token() == JSONToken.LITERAL_INT) {
            Number val = lexer.integerValue();
            lexer.nextToken(JSONToken.COMMA);
            return (T) val.toString().toCharArray();
        }

        Object value = parser.parse();

        if (value == null) {
            return null;
        }

        return (T) JSON.toJSONString(value).toCharArray();
    }

    public int getFastMatchToken() {
        return JSONToken.LITERAL_STRING;
    }

}
