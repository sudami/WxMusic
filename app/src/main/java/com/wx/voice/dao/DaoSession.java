package com.wx.voice.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.wx.voice.entity.DownFile;
import com.wx.voice.entity.AdEntity;

import com.wx.voice.dao.DownFileDao;
import com.wx.voice.dao.AdEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig downFileDaoConfig;
    private final DaoConfig adEntityDaoConfig;

    private final DownFileDao downFileDao;
    private final AdEntityDao adEntityDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        downFileDaoConfig = daoConfigMap.get(DownFileDao.class).clone();
        downFileDaoConfig.initIdentityScope(type);

        adEntityDaoConfig = daoConfigMap.get(AdEntityDao.class).clone();
        adEntityDaoConfig.initIdentityScope(type);

        downFileDao = new DownFileDao(downFileDaoConfig, this);
        adEntityDao = new AdEntityDao(adEntityDaoConfig, this);

        registerDao(DownFile.class, downFileDao);
        registerDao(AdEntity.class, adEntityDao);
    }
    
    public void clear() {
        downFileDaoConfig.clearIdentityScope();
        adEntityDaoConfig.clearIdentityScope();
    }

    public DownFileDao getDownFileDao() {
        return downFileDao;
    }

    public AdEntityDao getAdEntityDao() {
        return adEntityDao;
    }

}
