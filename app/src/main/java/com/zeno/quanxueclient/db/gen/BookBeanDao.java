package com.zeno.quanxueclient.db.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.zeno.quanxueclient.bean.BookBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK_BEAN".
*/
public class BookBeanDao extends AbstractDao<BookBean, Long> {

    public static final String TABLENAME = "BOOK_BEAN";

    /**
     * Properties of entity BookBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Author = new Property(1, String.class, "author", false, "AUTHOR");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property BaseUrl = new Property(3, String.class, "baseUrl", false, "BASE_URL");
        public final static Property CategoryUrl = new Property(4, String.class, "categoryUrl", false, "CATEGORY_URL");
        public final static Property Url = new Property(5, String.class, "url", false, "URL");
        public final static Property Desc = new Property(6, String.class, "desc", false, "DESC");
        public final static Property CoverRgb = new Property(7, String.class, "coverRgb", false, "COVER_RGB");
        public final static Property IsCollection = new Property(8, short.class, "isCollection", false, "IS_COLLECTION");
    }


    public BookBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BookBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"AUTHOR\" TEXT," + // 1: author
                "\"NAME\" TEXT," + // 2: name
                "\"BASE_URL\" TEXT," + // 3: baseUrl
                "\"CATEGORY_URL\" TEXT," + // 4: categoryUrl
                "\"URL\" TEXT," + // 5: url
                "\"DESC\" TEXT," + // 6: desc
                "\"COVER_RGB\" TEXT," + // 7: coverRgb
                "\"IS_COLLECTION\" INTEGER NOT NULL );"); // 8: isCollection
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(2, author);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String baseUrl = entity.getBaseUrl();
        if (baseUrl != null) {
            stmt.bindString(4, baseUrl);
        }
 
        String categoryUrl = entity.getCategoryUrl();
        if (categoryUrl != null) {
            stmt.bindString(5, categoryUrl);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(6, url);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(7, desc);
        }
 
        String coverRgb = entity.getCoverRgb();
        if (coverRgb != null) {
            stmt.bindString(8, coverRgb);
        }
        stmt.bindLong(9, entity.getIsCollection());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(2, author);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String baseUrl = entity.getBaseUrl();
        if (baseUrl != null) {
            stmt.bindString(4, baseUrl);
        }
 
        String categoryUrl = entity.getCategoryUrl();
        if (categoryUrl != null) {
            stmt.bindString(5, categoryUrl);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(6, url);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(7, desc);
        }
 
        String coverRgb = entity.getCoverRgb();
        if (coverRgb != null) {
            stmt.bindString(8, coverRgb);
        }
        stmt.bindLong(9, entity.getIsCollection());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public BookBean readEntity(Cursor cursor, int offset) {
        BookBean entity = new BookBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // author
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // baseUrl
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // categoryUrl
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // url
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // desc
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // coverRgb
            cursor.getShort(offset + 8) // isCollection
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAuthor(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBaseUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCategoryUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUrl(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDesc(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setCoverRgb(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setIsCollection(cursor.getShort(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BookBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BookBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
