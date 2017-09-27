//This is source code of favorite. Copyright?ìí. Tarks. All Rights Reserved.
package com.cym5240.pis.user.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DbOpenHelper {

	private static final String DATABASE_NAME = "favorite.db";
	private static final int DATABASE_VERSION = 2;
	public static SQLiteDatabase mDB;
	private DatabaseHelper mDBHelper;
	private Context mCtx;

	private class DatabaseHelper extends SQLiteOpenHelper{

		// ?Éù?Ñ±?ûê
		public DatabaseHelper(Context context, String name,
				CursorFactory factory, int version) {
			super(context, name, factory, version);
		}

		// ÏµúÏ¥à DBÎ•? ÎßåÎì§?ïå ?ïúÎ≤àÎßå ?ò∏Ï∂úÎêú?ã§.
		@Override
		public void onCreate(SQLiteDatabase db) {
			db.execSQL(DataBases.CreateDB._CREATE);

		}

		// Î≤ÑÏ†Ñ?ù¥ ?óÖ?ç∞?ù¥?ä∏ ?êò?óà?ùÑ Í≤ΩÏö∞ DBÎ•? ?ã§?ãú ÎßåÎì§?ñ¥ Ï§??ã§.
		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			db.execSQL("DROP TABLE IF EXISTS "+DataBases.CreateDB._TABLENAME);
			onCreate(db);
		}
	}

	public DbOpenHelper(Context context){
		this.mCtx = context;
	}

	public DbOpenHelper open() throws SQLException{
		mDBHelper = new DatabaseHelper(mCtx, DATABASE_NAME, null, DATABASE_VERSION);
		mDB = mDBHelper.getWritableDatabase();
		return this;
	}

	public void close(){
		mDB.close();
	}

	// Insert DB
	public long insertColumn(String user_srl, String profile_update,String profile_update_thumbnail, String profile_pic){
		ContentValues values = new ContentValues();
		values.put(DataBases.CreateDB.USER_SRL, user_srl);
		values.put(DataBases.CreateDB.PROFILE_UPDATE, profile_update);
		values.put(DataBases.CreateDB.PROFILE_UPDATE_THUMBNAIL, profile_update_thumbnail);
		values.put(DataBases.CreateDB.PROFILE_PIC, profile_pic);
		return mDB.insert(DataBases.CreateDB._TABLENAME, null, values);
	}

	// Update DB
	public boolean updateColumn(String user_srl, String profile_update, String profile_update_thumbnail, String profile_pic){
		ContentValues values = new ContentValues();
		values.put(DataBases.CreateDB.USER_SRL, user_srl);
		values.put(DataBases.CreateDB.PROFILE_UPDATE, profile_update);
		values.put(DataBases.CreateDB.PROFILE_UPDATE_THUMBNAIL, profile_update_thumbnail);
		values.put(DataBases.CreateDB.PROFILE_PIC, profile_pic);
		return mDB.update(DataBases.CreateDB._TABLENAME, values, "user_srl="+user_srl, null) > 0;
	}
	
	// Update Profile update DB
	public boolean updateProfileUpdate(String user_srl, String profile_update, String profile_pic){
		ContentValues values = new ContentValues();
		values.put(DataBases.CreateDB.USER_SRL, user_srl);
		values.put(DataBases.CreateDB.PROFILE_UPDATE, profile_update);
		values.put(DataBases.CreateDB.PROFILE_PIC, profile_pic);
		return mDB.update(DataBases.CreateDB._TABLENAME, values, "user_srl="+user_srl, null) > 0;
	}
	
	// Update Profile update DB
	public boolean updateProfileUpdateThumbnail(String user_srl, String profile_update_thumbnail, String profile_pic){
		ContentValues values = new ContentValues();
		values.put(DataBases.CreateDB.USER_SRL, user_srl);
		values.put(DataBases.CreateDB.PROFILE_UPDATE_THUMBNAIL, profile_update_thumbnail);
		values.put(DataBases.CreateDB.PROFILE_PIC, profile_pic);
		return mDB.update(DataBases.CreateDB._TABLENAME, values, "user_srl="+user_srl, null) > 0;
	}

	// Delete ID
	public boolean deleteColumn(long id){
		return mDB.delete(DataBases.CreateDB._TABLENAME, "_id="+id, null) > 0;
	}
	
	// Delete Contact
	public boolean deleteColumn(String number){
		return mDB.delete(DataBases.CreateDB._TABLENAME, "contact="+number, null) > 0;
	}
	
	// Select All
	public Cursor getAllColumns(){
		return mDB.query(DataBases.CreateDB._TABLENAME, null, null, null, null, null, null);
	}

	// ID Ïª¨Îüº ?ñª?ñ¥ ?ò§Í∏?
	public Cursor getColumn(long id){
		Cursor c = mDB.query(DataBases.CreateDB._TABLENAME, null, 
				"_id="+id, null, null, null, null);
		if(c != null && c.getCount() != 0)
			c.moveToFirst();
		return c;
	}
	
	// ID Ïª¨Îüº ?ñª?ñ¥ ?ò§Í∏?
	public Cursor getUserInfo(String user_srl){
		Cursor c = mDB.query(DataBases.CreateDB._TABLENAME, null, 
				"user_srl="+user_srl, null, null, null, null);
		if(c != null && c.getCount() != 0)
			c.moveToFirst();
		return c;
	}

	// ?ù¥Î¶? Í≤??Éâ ?ïòÍ∏? (rawQuery)
	public Cursor getUser(String user_srl){
		Cursor c = mDB.rawQuery( "select * from users where user_srl=" + "'" + user_srl + "'" , null);
		return c;
	}


}






