--Aeropuertos
INSERT INTO public.aeropuerto(id, ciudad, pais, zona_horaria)
VALUES(1, 'Bogotá', 'Colombia', 'GMT-5');
INSERT INTO public.aeropuerto(id, ciudad, pais, zona_horaria)
VALUES(2, 'Medellín', 'Colombia', 'GMT-5');
INSERT INTO public.aeropuerto(id, ciudad, pais, zona_horaria)
VALUES(3, 'Cali', 'Colombia', 'GMT-5');

--Vuelos
INSERT INTO public.vuelo(id, numero_vuelo)
VALUES(1, 'AV101234');
INSERT INTO public.vuelo(id, numero_vuelo)
VALUES(2, 'AV201234');
INSERT INTO public.vuelo(id, numero_vuelo)
VALUES(3, 'AV301234');
INSERT INTO public.vuelo(id, numero_vuelo)
VALUES(4, 'AV301234');
INSERT INTO public.vuelo(id, numero_vuelo)
VALUES(5, 'LA101234');
INSERT INTO public.vuelo(id, numero_vuelo)
VALUES(6, 'LA201234');
INSERT INTO public.vuelo(id, numero_vuelo)
VALUES(7, 'LA301234');
INSERT INTO public.vuelo(id, numero_vuelo)
VALUES(8, 'LA401234');

--Aviones
INSERT INTO public.avion(id, matricula, aerolinea)
VALUES(1, 'AV0001', 'Avianca');
INSERT INTO public.avion(id, matricula, aerolinea)
VALUES(2, 'AV0002', 'Avianca');
INSERT INTO public.avion(id, matricula, aerolinea)
VALUES(3, 'AV0003', 'Avianca');
INSERT INTO public.avion(id, matricula, aerolinea)
VALUES(4, 'AV0003', 'Avianca');
INSERT INTO public.avion(id, matricula, aerolinea)
VALUES(5, 'LA0001', 'LATAM');
INSERT INTO public.avion(id, matricula, aerolinea)
VALUES(6, 'LA0002', 'LATAM');
