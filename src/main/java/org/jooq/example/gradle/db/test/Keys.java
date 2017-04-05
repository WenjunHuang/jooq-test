/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.test;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.example.gradle.db.test.tables.Author;
import org.jooq.example.gradle.db.test.tables.Book;
import org.jooq.example.gradle.db.test.tables.BookStore;
import org.jooq.example.gradle.db.test.tables.BookToBookStore;
import org.jooq.example.gradle.db.test.tables.Language;
import org.jooq.example.gradle.db.test.tables.records.AuthorRecord;
import org.jooq.example.gradle.db.test.tables.records.BookRecord;
import org.jooq.example.gradle.db.test.tables.records.BookStoreRecord;
import org.jooq.example.gradle.db.test.tables.records.BookToBookStoreRecord;
import org.jooq.example.gradle.db.test.tables.records.LanguageRecord;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>test</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = UniqueKeys0.KEY_AUTHOR_PRIMARY;
    public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = UniqueKeys0.KEY_BOOK_PRIMARY;
    public static final UniqueKey<BookStoreRecord> KEY_BOOK_STORE_NAME = UniqueKeys0.KEY_BOOK_STORE_NAME;
    public static final UniqueKey<BookToBookStoreRecord> KEY_BOOK_TO_BOOK_STORE_PRIMARY = UniqueKeys0.KEY_BOOK_TO_BOOK_STORE_PRIMARY;
    public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_PRIMARY = UniqueKeys0.KEY_LANGUAGE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BookRecord, AuthorRecord> FK_BOOK_AUTHOR = ForeignKeys0.FK_BOOK_AUTHOR;
    public static final ForeignKey<BookRecord, LanguageRecord> FK_BOOK_LANGUAGE = ForeignKeys0.FK_BOOK_LANGUAGE;
    public static final ForeignKey<BookToBookStoreRecord, BookStoreRecord> FK_B2BS_BOOK_STORE = ForeignKeys0.FK_B2BS_BOOK_STORE;
    public static final ForeignKey<BookToBookStoreRecord, BookRecord> FK_B2BS_BOOK = ForeignKeys0.FK_B2BS_BOOK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = createUniqueKey(Author.AUTHOR, "KEY_author_PRIMARY", Author.AUTHOR.ID);
        public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = createUniqueKey(Book.BOOK, "KEY_book_PRIMARY", Book.BOOK.ID);
        public static final UniqueKey<BookStoreRecord> KEY_BOOK_STORE_NAME = createUniqueKey(BookStore.BOOK_STORE, "KEY_book_store_name", BookStore.BOOK_STORE.NAME);
        public static final UniqueKey<BookToBookStoreRecord> KEY_BOOK_TO_BOOK_STORE_PRIMARY = createUniqueKey(BookToBookStore.BOOK_TO_BOOK_STORE, "KEY_book_to_book_store_PRIMARY", BookToBookStore.BOOK_TO_BOOK_STORE.NAME, BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);
        public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_PRIMARY = createUniqueKey(Language.LANGUAGE, "KEY_language_PRIMARY", Language.LANGUAGE.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<BookRecord, AuthorRecord> FK_BOOK_AUTHOR = createForeignKey(org.jooq.example.gradle.db.test.Keys.KEY_AUTHOR_PRIMARY, Book.BOOK, "fk_book_author", Book.BOOK.AUTHOR_ID);
        public static final ForeignKey<BookRecord, LanguageRecord> FK_BOOK_LANGUAGE = createForeignKey(org.jooq.example.gradle.db.test.Keys.KEY_LANGUAGE_PRIMARY, Book.BOOK, "fk_book_language", Book.BOOK.LANGUAGE_ID);
        public static final ForeignKey<BookToBookStoreRecord, BookStoreRecord> FK_B2BS_BOOK_STORE = createForeignKey(org.jooq.example.gradle.db.test.Keys.KEY_BOOK_STORE_NAME, BookToBookStore.BOOK_TO_BOOK_STORE, "fk_b2bs_book_store", BookToBookStore.BOOK_TO_BOOK_STORE.NAME);
        public static final ForeignKey<BookToBookStoreRecord, BookRecord> FK_B2BS_BOOK = createForeignKey(org.jooq.example.gradle.db.test.Keys.KEY_BOOK_PRIMARY, BookToBookStore.BOOK_TO_BOOK_STORE, "fk_b2bs_book", BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);
    }
}
