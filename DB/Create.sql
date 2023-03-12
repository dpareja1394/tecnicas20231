CREATE TABLE trayecto (
  id                 serial primary key, 
  fecha_hora_salida  timestamp NOT NULL, 
  fecha_hora_llegada timestamp NOT NULL, 
  avion_id           integer NOT NULL, 
  vuelo_id           integer NOT NULL, 
  aeropuerto_origen  integer NOT NULL, 
  aeropuerto_destino integer NOT null
 );
CREATE TABLE aeropuerto (
  id           serial primary key,
  ciudad       varchar(50) NOT NULL, 
  pais         varchar(50) NOT NULL, 
  zona_horaria varchar(15)
  );
CREATE TABLE vuelo (
  id           serial primary key,
  numero_vuelo varchar(15) NOT null
 );
CREATE TABLE avion (
  id        serial primary key,
  matricula varchar(15) NOT NULL, 
  aerolinea varchar(15) NOT null
 );
ALTER TABLE trayecto ADD CONSTRAINT fk_tray_avio FOREIGN KEY (avion_id) REFERENCES avion (id);
ALTER TABLE trayecto ADD CONSTRAINT fk_tray_vuel FOREIGN KEY (vuelo_id) REFERENCES vuelo (id);
ALTER TABLE trayecto ADD CONSTRAINT fk_tray_aero_1 FOREIGN KEY (aeropuerto_origen) REFERENCES aeropuerto (id);
ALTER TABLE trayecto ADD CONSTRAINT fk_tray_aero_2 FOREIGN KEY (aeropuerto_destino) REFERENCES aeropuerto (id);
