--Aeropuertos
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional El Dorado', 'BOG', 'Bogotá');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional José María Córdova', 'MDE', 'Medellín');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional Rafael Núñez', 'CTG', 'Cartagena');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional Alfonso Bonilla Aragón', 'CLO', 'Cali');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional Ernesto Cortissoz', 'BAQ', 'Barranquilla');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional Gustavo Rojas Pinilla', 'ADZ', 'San Andrés');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional Matecaña', 'PEI', 'Pereira');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional Antonio Nariño', 'PSO', 'Chachagüí (Pasto)');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional Camilo Daza', 'CUC', 'Cúcuta');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional Palonegro', 'BGA', 'Bucaramanga');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional El Edén', 'AXM', 'Armenia');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional Perales', 'IBE', 'Ibagué');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional Gerardo Tobar López', 'BUN', 'Buenaventura');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional Los Garzones', 'MTR', 'Montería');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Internacional Antonio Roldán Betancourt', 'APO', 'Carepa');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Almirante Padilla', 'RCH', 'Riohacha');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Vanguardia', 'VVC', 'Villavicencio');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto El Caraño', 'UIB', 'Quibdó');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto La Nubia', 'MZL', 'Manizales');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Antonio Nariño', 'LQU', 'La Unión');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Reyes Murillo', 'NQU', 'Nuquí');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Santa Ana', 'CRC', 'Cartago');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Santa Marta', 'SMR', 'Santa Marta');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Las Brujas', 'CZU', 'Corozal');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Alfonso López Pumarejo', 'VUP', 'Valledupar');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Los Colonizadores', 'RVE', 'Saravena');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Tres de Mayo', 'PPN', 'Popayán');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto El Embrujo', 'PVA', 'Providencia');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Alcides Fernández', 'ACD', 'Acandí');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto El Caraño', 'UIB', 'Quibdó');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto El Edén', 'LTI', 'La Tebaida');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto La Florida', 'TCO', 'Tumaco');
INSERT INTO public.aeropuerto(nombre, iata, ubicacion) 
VALUES ('Aeropuerto Simón Bolívar', 'SMR', 'Santa Marta');

--Roles Usuario
INSERT INTO public.rol_usuario(descripcion)
VALUES('Viajero Frecuente');

INSERT INTO public.rol_usuario(descripcion)
VALUES('VIP');

INSERT INTO public.rol_usuario(descripcion)
VALUES('Viajero Ocasional');

--Usuario 
INSERT INTO public.usuario(rous_id, cedula, nombre, apellido, correo)
VALUES(2, '101234', 'Daniel', 'Pareja Londoño', 'dpl@mail.com');