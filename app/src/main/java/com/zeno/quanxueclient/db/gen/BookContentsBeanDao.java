package com.zeno.quanxueclient.db.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.zeno.quanxueclient.bean.BookContentsBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK_CONTENTS_BEAN".
*/
public class BookContentsBeanDao extends AbstractDao<BookContentsBean, Void> {

    public static final String TABLENAME = "BOOK_CONTENTS_BEAN";

    /**
     * Properties of entity BookContentsBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property BookUrl = new Property(0, String.class, "bookUrl", false, "BOOK_URL");
        public final static Property SectionName = new Property(1, String.class, "sectionName", false, "SECTION_NAME");
        public final static Property SectionUrl = new Property(2, String.class, "sectionUrl", false, "SECTION_URL");
    }


    public BookContentsBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BookContentsBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_CONTENTS_BEAN\" (" + //
                "\"BOOK_URL\" TEXT," + // 0: bookUrl
                "\"SECTION_NAME\" TEXT," + // 1: sectionName
                "\"SECTION_URL\" TEXT);"); // 2: sectionUrl
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_CONTENTS_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookContentsBean entity) {
        stmt.clearBindings();
 
        String bookUrl = entity.getBookUrl();
        if (bookUrl != null) {
            stmt.bindString(1, bookUrl);
        }
 
        String sectionName = entity.getSectionName();
        if (sectionName != null) {
            stmt.bindString(2, sectionName);
        }
 
        String sectionUrl = entity.getSectionUrl();
        if (sectionUrl != null) {
            stmt.bindString(3, sectionUrl);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookContentsBean entity) {
        stmt.clearBindings();
 
        String bookUrl = entity.getBookUrl();
        if (bookUrl != null) {
            stmt.bindString(1, bookUrl);
        }
 
        String sectionName = entity.getSectionName();
        if (sectionName != null) {
            stmt.bindString(2, sectionName);
        }
 
        String sectionUrl = entity.getSectionUrl();
        if (sectionUrl != null) {
            stmt.bindString(3, sectionUrl);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public BookContentsBean readEntity(Cursor cursor, int offset) {
        BookContentsBean entity = new BookContentsBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // bookUrl
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // sectionName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // sectionUrl
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookContentsBean entity, int offset) {
        entity.setBookUrl(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setSectionName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSectionUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(BookContentsBean entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(BookContentsBean entity) {
        return null;
    }

    @Override
    public boolean hasKey(BookContentsBean entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
