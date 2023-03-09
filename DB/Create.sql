CREATE TABLE trayecto (
  id                 numeric(19, 0) NOT NULL, 
  fecha_hora_salida  timestamp NOT NULL, 
  fecha_hora_llegada timestamp NOT NULL, 
  avion_id           numeric NOT NULL, 
  vuelo_id           numeric(19, 0) NOT NULL, 
  aeropuerto_origen  numeric(19, 0) NOT NULL, 
  aeropuerto_destino numeric(19, 0) NOT NULL, 
  PRIMARY KEY (id));
CREATE TABLE aeropuerto (
  id           numeric(19, 0) NOT NULL, 
  ciudad       varchar(50) NOT NULL, 
  pais         varchar(50) NOT NULL, 
  zona_horaria varchar(15), 
  PRIMARY KEY (id));
CREATE TABLE vuelo (
  id           numeric(19, 0) NOT NULL, 
  numero_vuelo varchar(15) NOT NULL, 
  CONSTRAINT pk_vuelo 
    PRIMARY KEY (id));
CREATE TABLE avion (
  id        numeric NOT NULL, 
  matricula varchar(15) NOT NULL, 
  aerolinea varchar(15) NOT NULL, 
  PRIMARY KEY (id));
ALTER TABLE trayecto ADD CONSTRAINT fk_tray_avio FOREIGN KEY (avion_id) REFERENCES avion (id);
ALTER TABLE trayecto ADD CONSTRAINT fk_tray_vuel FOREIGN KEY (vuelo_id) REFERENCES vuelo (id);
ALTER TABLE trayecto ADD CONSTRAINT fk_tray_aero_1 FOREIGN KEY (aeropuerto_origen) REFERENCES aeropuerto (id);
ALTER TABLE trayecto ADD CONSTRAINT fk_tray_aero_2 FOREIGN KEY (aeropuerto_destino) REFERENCES aeropuerto (id);