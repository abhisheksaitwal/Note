package examaple.yugenspark.com.note;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Abhi on 26-07-2016.
 */
public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "NOTES.db";
    public static final String TABLE_NAME = "TITLEANDCONTENT";
    public static final String ID = "ID";
    public static final String TITLE = "TITLE";
    public static final String CONTENT = "CONTENT";


    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME , null , 1);


    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(" CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT , TITLE TEXT , CONTENT TEXT) " );


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME );
        onCreate(db);
    }

    public boolean insertData(String titlefromcreate , String contentfromcreate)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TITLE , titlefromcreate);
        contentValues.put(CONTENT , contentfromcreate);
        long result =  db.insert(TABLE_NAME , null , contentValues);
        if(result == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
