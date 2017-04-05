/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.example.gradle.db.DefaultCatalog;
import org.jooq.example.gradle.db.test.tables.Author;
import org.jooq.example.gradle.db.test.tables.Book;
import org.jooq.example.gradle.db.test.tables.BookStore;
import org.jooq.example.gradle.db.test.tables.BookToBookStore;
import org.jooq.example.gradle.db.test.tables.Language;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Test extends SchemaImpl {

    private static final long serialVersionUID = 2087059012;

    /**
     * The reference instance of <code>test</code>
     */
    public static final Test TEST = new Test();

    /**
     * The table <code>test.author</code>.
     */
    public final Author AUTHOR = org.jooq.example.gradle.db.test.tables.Author.AUTHOR;

    /**
     * The table <code>test.book</code>.
     */
    public final Book BOOK = org.jooq.example.gradle.db.test.tables.Book.BOOK;

    /**
     * The table <code>test.book_store</code>.
     */
    public final BookStore BOOK_STORE = org.jooq.example.gradle.db.test.tables.BookStore.BOOK_STORE;

    /**
     * The table <code>test.book_to_book_store</code>.
     */
    public final BookToBookStore BOOK_TO_BOOK_STORE = org.jooq.example.gradle.db.test.tables.BookToBookStore.BOOK_TO_BOOK_STORE;

    /**
     * The table <code>test.language</code>.
     */
    public final Language LANGUAGE = org.jooq.example.gradle.db.test.tables.Language.LANGUAGE;

    /**
     * No further instances allowed
     */
    private Test() {
        super("test", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Author.AUTHOR,
            Book.BOOK,
            BookStore.BOOK_STORE,
            BookToBookStore.BOOK_TO_BOOK_STORE,
            Language.LANGUAGE);
    }
}