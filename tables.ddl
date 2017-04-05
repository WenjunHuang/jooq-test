CREATE TABLE author
(
  id            INT         NOT NULL
    PRIMARY KEY,
  first_name    VARCHAR(50) NULL,
  last_name     VARCHAR(50) NOT NULL,
  date_of_birth DATE        NULL,
  year_of_birth INT         NULL,
  distinguished INT         NULL
);

CREATE TABLE book
(
  id           INT          NOT NULL
    PRIMARY KEY,
  author_id    INT          NOT NULL,
  title        VARCHAR(400) NOT NULL,
  published_in INT          NOT NULL,
  language_id  INT          NOT NULL,
  CONSTRAINT fk_book_author
  FOREIGN KEY (author_id) REFERENCES author (id)
);

CREATE INDEX fk_book_author
  ON book (author_id);

CREATE INDEX fk_book_language
  ON book (language_id);

CREATE TABLE book_store
(
  name VARCHAR(400) NOT NULL,
  CONSTRAINT name
  UNIQUE (name)
);

CREATE TABLE book_to_book_store
(
  name    VARCHAR(400) NOT NULL,
  book_id INT          NOT NULL,
  stock   INT          NULL,
  PRIMARY KEY (name, book_id),
  CONSTRAINT fk_b2bs_book_store
  FOREIGN KEY (name) REFERENCES book_store (name)
    ON DELETE CASCADE,
  CONSTRAINT fk_b2bs_book
  FOREIGN KEY (book_id) REFERENCES book (id)
    ON DELETE CASCADE
);

CREATE INDEX fk_b2bs_book
  ON book_to_book_store (book_id);

CREATE TABLE language
(
  id          INT         NOT NULL
    PRIMARY KEY,
  cd          CHAR(2)     NOT NULL,
  description VARCHAR(50) NULL
);

ALTER TABLE book
  ADD CONSTRAINT fk_book_language
FOREIGN KEY (language_id) REFERENCES language (id);

