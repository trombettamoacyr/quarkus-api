CREATE TABLE "user" (
    id      uuid PRIMARY KEY NOT NULL DEFAULT gen_random_uuid(),
    name    CHARACTER VARYING (50) NOT NULL,
    email   CHARACTER VARYING (50) NOT NULL
);