DELETE FROM users;
DELETE FROM images;

INSERT INTO users(firstName, lastName, email, password) VALUES
  ('Andrew', 'Golimbievsky','andrew@gmail.com', '3147548'),
  ('Great', 'Petr', 'petr@matushkarossiya.com', '1234567holop');

INSERT INTO images(image_id, image_ref) VALUES
  (1,'img1.png'),
  (2,'img2.png');