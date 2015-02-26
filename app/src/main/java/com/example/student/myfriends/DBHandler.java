package com.example.student.myfriends;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import java.util.ArrayList;
import java.util.List;

public class DBHandler extends SQLiteOpenHelper {
    private static final int version = 1;
    private static final String name = "testDB";
    private static final String tableName = "friends";

    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + tableName + " (" +
                "  id INTEGER PRIMARY KEY NOT NULL," +
                "  name varchar(255) default NULL," +
                "  phone varchar(100) default NULL," +
                "  email varchar(255) default NULL" +
                ");";

        db.execSQL(sql);

        sql = "INSERT INTO `friends` (`name`,`phone`,`email`) VALUES ('Lane Decker','1-943-869-3344','risus@duiFuscediam.net'),('Dora Keith','1-970-156-5175','In.lorem@Nullasempertellus.com'),('Nell Riggs','1-596-523-8516','vel.mauris.Integer@sagittisDuisgravida.org'),('Tad Gardner','1-514-268-4568','lectus@dolor.org'),('Idola Blanchard','1-881-264-3696','urna.justo@turpis.net'),('Blair Sutton','1-501-767-0015','Duis.elementum@consequatauctor.com'),('Kaye Randolph','1-338-969-4724','magna@nonummyipsumnon.net'),('Cora Monroe','1-318-203-4610','magna@fringillaornare.org'),('Oliver House','1-905-798-7860','Nunc.ac@magna.edu'),('Susan Kramer','1-314-901-1027','lorem.lorem@lacusMauris.org'),('Gage Olson','1-192-242-9722','ligula.eu.enim@sitamet.org'),('Yoshi Noel','1-139-830-1014','non@pede.edu'),('Felicia Whitaker','1-414-901-6419','augue.ac@augue.net'),('Candice Little','1-462-988-3935','ut.quam.vel@Aliquamultricesiaculis.co.uk'),('Maryam Austin','1-232-183-6931','Phasellus@egetmetus.edu'),('Jin Booth','1-102-188-6941','sed.libero@molestiearcuSed.ca'),('Inga Rivers','1-367-706-4598','eu@Nunccommodoauctor.org'),('Lilah Horn','1-555-186-4377','erat@luctusvulputate.co.uk'),('Angela Pate','1-119-129-5177','odio.Aliquam.vulputate@malesuadaaugueut.net'),('Callum Payne','1-195-645-5475','ipsum.nunc@Morbinequetellus.ca'),('Octavius Gibson','1-880-464-2437','sapien.Nunc@in.edu'),('Kiayada Sykes','1-569-661-0561','nunc.ac@Sednunc.org'),('Keaton Howard','1-907-239-8400','mi@dignissim.co.uk'),('Tanisha Bradford','1-830-758-8136','est.mauris@adipiscinglobortis.co.uk'),('Veda Spears','1-832-385-4300','id.nunc.interdum@nec.com'),('Raven Nolan','1-946-677-1537','Cras.convallis@Cumsociis.org'),('Murphy Stafford','1-891-480-3912','ipsum@Loremipsum.org'),('Lionel Kirkland','1-164-284-3078','in.molestie.tortor@neccursus.org'),('Callie Webb','1-163-933-6367','pede@Nullamsuscipit.com'),('Jaime Molina','1-325-375-8392','adipiscing.fringilla.porttitor@dolorsitamet.ca'),('Armando Sparks','1-758-422-0136','Donec.felis.orci@a.ca'),('Minerva Oconnor','1-230-698-4634','mi.lorem@cursus.co.uk'),('Mona Torres','1-956-326-3792','aliquet@Morbisitamet.org'),('Rina Eaton','1-989-560-2809','Proin.ultrices.Duis@orci.ca'),('Chester Campos','1-242-715-4005','sem@tellusid.com'),('Jesse Bird','1-359-450-1929','aliquet.magna.a@odioEtiamligula.org'),('Charity Pace','1-438-308-2107','erat@arcuCurabiturut.ca'),('Kelsie Beck','1-534-950-2290','euismod.ac.fermentum@Nullam.org'),('Adele Robbins','1-610-255-7986','eros.Nam.consequat@nonegestas.org'),('Leila Erickson','1-421-858-5428','arcu.Curabitur@Suspendissealiquet.edu'),('Ina Armstrong','1-951-765-7099','vitae@quamdignissimpharetra.edu'),('Clementine Everett','1-523-577-6963','vulputate@et.com'),('Whilemina Clements','1-865-936-4500','id.enim@inconsectetueripsum.ca'),('Xavier Mcdowell','1-682-960-2392','sociis.natoque@consequatnecmollis.com'),('Amanda Beard','1-339-517-3480','sed@natoque.com'),('Leslie Reyes','1-152-825-5206','risus.quis@porttitortellus.edu'),('Ariel Middleton','1-300-720-9690','et.magna.Praesent@Aliquamrutrum.com'),('Odette Carrillo','1-392-873-5248','vitae.dolor.Donec@lacuspede.com'),('Cheryl Reed','1-647-539-0241','sagittis.semper.Nam@felis.com'),('Remedios Powers','1-670-174-7041','fermentum.risus.at@mattis.org'),('Alea Banks','1-493-562-6857','fringilla@nequevitaesemper.org'),('Dara Kemp','1-850-762-2396','at@Craslorem.net'),('Gregory Rasmussen','1-108-281-4481','luctus@vitaenibh.ca'),('Hayley Robinson','1-234-596-2088','primis@mauris.ca'),('Carson Townsend','1-138-434-0098','aliquet.molestie.tellus@nec.org'),('Hiram Shaffer','1-494-640-4412','mattis@et.net'),('Buckminster Spencer','1-840-230-7161','amet.risus.Donec@semvitaealiquam.co.uk'),('Rogan Whitaker','1-648-477-5565','at.velit@Cras.net'),('Dolan Franco','1-715-552-9762','commodo@enim.co.uk'),('Hayden Pitts','1-612-632-4444','erat@Nullamvitae.net'),('Kim Gillespie','1-806-572-4544','Duis.risus.odio@ornaretortor.edu'),('Lenore Woods','1-415-931-8676','porttitor@euultrices.edu'),('Leslie Moran','1-507-232-4706','risus@parturient.edu'),('Blaze Hurst','1-731-436-5801','orci.luctus.et@egestasligula.edu'),('Ulric Rivers','1-568-514-2691','eget.laoreet@taciti.com'),('Ethan Glover','1-888-939-4181','hendrerit.Donec.porttitor@turpis.com'),('Amaya Stout','1-718-100-7915','amet.nulla.Donec@adipiscing.ca'),('Guinevere Brewer','1-500-638-2871','Integer.sem@vitaeodio.org'),('Ella Espinoza','1-374-707-5885','et.eros@elementumlorem.net'),('Jacob Huber','1-960-871-5756','adipiscing.elit.Curabitur@Uttinciduntvehicula.ca'),('Breanna Nunez','1-794-504-4388','tempus.eu.ligula@malesuada.net'),('Vanna Howard','1-650-833-2102','dictum.mi.ac@Quisque.org'),('Sylvia Meyer','1-473-480-9464','Suspendisse.non@consectetuer.edu'),('Magee Mendez','1-640-379-1368','lacinia@utquam.edu'),('Erasmus Sears','1-347-945-6450','eleifend.vitae@nibhlacinia.co.uk'),('Shana Tucker','1-132-661-7713','vel.quam.dignissim@lectusasollicitudin.co.uk'),('Haley Gilbert','1-747-872-7566','magna.et.ipsum@Cras.com'),('Diana Crane','1-278-570-5850','fringilla.cursus@egetdictumplacerat.edu'),('Basil Buck','1-674-699-0663','a@maurisInteger.com'),('Abel Carson','1-333-472-0943','at@sagittis.edu'),('Taylor Simpson','1-584-212-8077','est.arcu@consectetuerrhoncusNullam.org'),('Miriam Hewitt','1-110-170-7653','turpis@ac.org'),('Francis Wilkins','1-214-811-1813','Nulla@dictumsapienAenean.co.uk'),('Amir Wheeler','1-584-656-5329','libero@quisaccumsanconvallis.com'),('Colt Rice','1-375-797-7758','neque.Morbi@metussitamet.org'),('Neve Fleming','1-696-928-0220','sit.amet@Vivamusrhoncus.net'),('Denise Santiago','1-275-232-1074','posuere@ametmassa.ca'),('Kalia Hinton','1-860-568-6263','purus.sapien@vitaevelitegestas.com'),('Noelle Hopkins','1-860-380-4990','Nunc.ac@diamluctuslobortis.ca'),('Hillary Rivers','1-318-974-6046','dis.parturient@idnunc.com'),('Blaine Donovan','1-754-278-1865','felis.eget@sollicitudina.co.uk'),('Jackson Tanner','1-420-859-8533','odio.semper.cursus@ategestasa.ca'),('Stella Hopper','1-127-409-3448','enim.consequat.purus@est.net'),('Eugenia Bullock','1-310-404-8571','cursus.vestibulum@lorem.ca'),('Zephania Sweeney','1-789-540-3717','magna@non.com'),('Stacey Curry','1-274-901-2898','auctor.nunc.nulla@Suspendisseseddolor.ca'),('Lilah Sweet','1-497-284-0566','nulla.at.sem@luctuslobortis.edu'),('Roanna Beasley','1-991-538-1257','purus@convallisligulaDonec.edu'),('Solomon Mckinney','1-885-325-1208','mus@facilisisegetipsum.org'),('Hanna Lindsay','1-248-200-5802','sodales.Mauris.blandit@vel.co.uk');";
        db.execSQL(sql);
        System.out.println("Created table");

    }

    public List<Friend> getAllFriends(SQLiteDatabase db) {
        String sql = "SELECT * FROM 'friends'";
        Cursor cursor = db.rawQuery(sql, null);
        List<Friend> friends = new ArrayList<Friend>();
        for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            Friend friend = new Friend();
            friend.setId(cursor.getString(0));
            friend.setName(cursor.getString(1));
            friend.setPhone(cursor.getString(2));
            friend.setEmail(cursor.getString(3));
            friend.toString();
            friends.add(friend);
        }
        return friends;
    }

    public Friend getFriend(SQLiteDatabase db, String name) {
        String sql = "Select * from friends WHERE name = '" + name + "';";
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToFirst();
        Friend friend = new Friend();
        friend.setId(cursor.getString(0));
        friend.setName(cursor.getString(1));
        friend.setPhone(cursor.getString(2));
        friend.setEmail(cursor.getString(3));
        return friend;
    }

    public List<String> getAllNames(SQLiteDatabase db) {
        String sql = "SELECT name FROM 'friends'";
        Cursor cursor = db.rawQuery(sql, null);
        List<String> names = new ArrayList<String>();
        for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            names.add(cursor.getString(0));

        }
        System.out.println("Found # of names:" + names.size());
        return names;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + tableName);
        onCreate(db);
    }
}
