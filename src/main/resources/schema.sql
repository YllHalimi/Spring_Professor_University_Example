INSERT into professor(ID, CREATED_BY, EMAIL, FIRST_NAME, LAST_NAME, MOBILE_NUMBER) VALUES
(1L,'ylli','ylli@gmail.com','yll','halimi','123456');


INSERT into LOCATION(ID, DESCRIPTION ,LAT ,LNG ,PLACE)
VALUES(1L, 'Prishtine',1.24,1.45, 'Kosove'),
(2L, 'Gjilan',1.24,1.45, 'Kosove'),
(3L, 'Ferizaj',1.24,1.45, 'Kosove');

INSERT INTO USER(ID ,EMAIL ,FIRST_NAME ,LAST_NAME ,PASSWORD ,USERNAME ,LOCATION_ID)
values(1L,'halimiyll@gmail.com', 'yll', 'halimi','123456','yh264',1L),
      (2L,'halimiyll@gmail.com', 'yll', 'halimi','123456','yh264',1L),
      (3L,'halimiyll@gmail.com', 'yll', 'halimi','123456','yh264',1L),
      (4L,'halimiyll@gmail.com', 'yll', 'halimi','123456','yh264',2L),
      (5L,'halimiyll@gmail.com', 'yll', 'halimi','123456','yh264',2L),
      (6L,'halimiyll@gmail.com', 'yll', 'halimi','123456','yh264',2L),
      (7L,'halimiyll@gmail.com', 'yll', 'halimi','123456','yh264',3L),
      (8L,'halimiyll@gmail.com', 'yll', 'halimi','123456','yh264',3L),
      (9L,'halimiyll@gmail.com', 'yll', 'halimi','123456','yh264',3L);