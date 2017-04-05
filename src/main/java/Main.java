import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.jooq.example.gradle.db.test.Tables.AUTHOR;

/**
 * Created by rick on 3/31/2017.
 */
public class Main {
    public static void main(String[] args) {
        String userName = "root";
        String password = "example";
        String url = "jdbc:mysql://192.168.56.101:3306/test";

        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            Result<Record> result = create.select().from(AUTHOR).fetch();

            for (Record r: result) {
                Integer id = r.getValue(AUTHOR.ID);
                String firstName = r.getValue(AUTHOR.FIRST_NAME);
                String lastName = r.getValue(AUTHOR.LAST_NAME);
                System.out.println("ID: " + id + " first name: "+ firstName +" last name: " + lastName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
