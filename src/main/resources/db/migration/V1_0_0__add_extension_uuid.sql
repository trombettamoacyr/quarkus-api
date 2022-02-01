CREATE EXTENSION IF NOT EXISTS pgcrypto;

CREATE TABLE IF NOT EXISTS car (
    id      uuid PRIMARY KEY NOT NULL DEFAULT gen_random_uuid(),
    model   VARCHAR(50) NOT NULL,
    brand   VARCHAR(50) NOT NULL
);
