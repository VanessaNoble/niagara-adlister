
CREATE DATABASE IF NOT EXISTS adlister_db;


use adlister_db;


INSERT into ads(title, description) VALUES
('playstation for sale', 'This is a slightly used playstation'),
('Super Nintindo','Get your game on with this old-school classic!')
('Junior Java Developer Position', 'Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript'),
('JavaScript Developer needed', 'Must have strong Java skills');

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  username VARCHAR(240) NOT NULL,
  email VARCHAR(240) NOT NULL,
  password VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE ads (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id INT UNSIGNED NOT NULL,
  title VARCHAR(240) NOT NULL,
  description TEXT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users(id)
    ON DELETE CASCADE
);