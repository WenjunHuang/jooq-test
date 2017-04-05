package jooqtest

import collection.JavaConversions._
import java.sql.DriverManager

import org.jooq._
import org.jooq.example.gradle.db.test.Tables._
import org.jooq.impl.DSL._
import org.jooq.impl._
import org.jooq.scalaextensions.Conversions._

/**
  * Created by rick on 3/31/2017.
  */
object Test {
    def main(args: scala.Array[String]): Unit = {
        val userName = "root";
        val password = "example";
        val url = "jdbc:mysql://192.168.56.101:3306/test";

        val c = DriverManager.getConnection(url, userName, password)
        val e = DSL.using(c, SQLDialect.MYSQL)

        val titles1 = e.select().from(BOOK).fetch().getValues(BOOK.TITLE)
        val titles2 = e.select().from(BOOK).fetch(BOOK.TITLE)
        val titles3 = e.select().from(BOOK).fetchArray(BOOK.TITLE)

        val ids1 = e select() from BOOK fetch() getValues(BOOK.ID, classOf[Long])
        val ids2 = e select() from BOOK fetch(BOOK.ID, classOf[Long])
        val ids3 = e select() from BOOK fetchArray(BOOK.ID, classOf[Long])

        val map1 = e selectFrom BOOK fetch() intoMap(BOOK.ID)
        val map2 = e selectFrom BOOK fetchMap(BOOK.ID)
        val map3 = e selectFrom BOOK fetch() intoMap(BOOK.ID, BOOK.TITLE)
    }

}
