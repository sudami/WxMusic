package com.wx.voice.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.wx.voice.entity.AdEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "AD_ENTITY".
*/
public class AdEntityDao extends AbstractDao<AdEntity, Long> {

    public static final String TABLENAME = "AD_ENTITY";

    /**
     * Properties of entity AdEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property AdImage = new Property(1, String.class, "adImage", false, "AD_IMAGE");
        public final static Property IconUrl = new Property(2, String.class, "iconUrl", false, "ICON_URL");
        public final static Property ApkUrl = new Property(3, String.class, "apkUrl", false, "APK_URL");
        public final static Property Code = new Property(4, String.class, "code", false, "CODE");
        public final static Property Desc = new Property(5, String.class, "desc", false, "DESC");
        public final static Property DetailUrl = new Property(6, String.class, "detailUrl", false, "DETAIL_URL");
        public final static Property Title = new Property(7, String.class, "title", false, "TITLE");
        public final static Property Rating = new Property(8, float.class, "rating", false, "RATING");
    }


    public AdEntityDao(DaoConfig config) {
        super(config);
    }
    
    public AdEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"AD_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ," + // 0: id
                "\"AD_IMAGE\" TEXT," + // 1: adImage
                "\"ICON_URL\" TEXT," + // 2: iconUrl
                "\"APK_URL\" TEXT," + // 3: apkUrl
                "\"CODE\" TEXT," + // 4: code
                "\"DESC\" TEXT," + // 5: desc
                "\"DETAIL_URL\" TEXT," + // 6: detailUrl
                "\"TITLE\" TEXT," + // 7: title
                "\"RATING\" REAL NOT NULL );"); // 8: rating
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"AD_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, AdEntity entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String adImage = entity.getAdImage();
        if (adImage != null) {
            stmt.bindString(2, adImage);
        }
 
        String iconUrl = entity.getIconUrl();
        if (iconUrl != null) {
            stmt.bindString(3, iconUrl);
        }
 
        String apkUrl = entity.getApkUrl();
        if (apkUrl != null) {
            stmt.bindString(4, apkUrl);
        }
 
        String code = entity.getCode();
        if (code != null) {
            stmt.bindString(5, code);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(6, desc);
        }
 
        String detailUrl = entity.getDetailUrl();
        if (detailUrl != null) {
            stmt.bindString(7, detailUrl);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(8, title);
        }
        stmt.bindDouble(9, entity.getRating());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, AdEntity entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String adImage = entity.getAdImage();
        if (adImage != null) {
            stmt.bindString(2, adImage);
        }
 
        String iconUrl = entity.getIconUrl();
        if (iconUrl != null) {
            stmt.bindString(3, iconUrl);
        }
 
        String apkUrl = entity.getApkUrl();
        if (apkUrl != null) {
            stmt.bindString(4, apkUrl);
        }
 
        String code = entity.getCode();
        if (code != null) {
            stmt.bindString(5, code);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(6, desc);
        }
 
        String detailUrl = entity.getDetailUrl();
        if (detailUrl != null) {
            stmt.bindString(7, detailUrl);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(8, title);
        }
        stmt.bindDouble(9, entity.getRating());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public AdEntity readEntity(Cursor cursor, int offset) {
        AdEntity entity = new AdEntity( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // adImage
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // iconUrl
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // apkUrl
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // code
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // desc
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // detailUrl
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // title
            cursor.getFloat(offset + 8) // rating
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, AdEntity entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setAdImage(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setIconUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setApkUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCode(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDesc(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDetailUrl(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTitle(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setRating(cursor.getFloat(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(AdEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(AdEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(AdEntity entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}