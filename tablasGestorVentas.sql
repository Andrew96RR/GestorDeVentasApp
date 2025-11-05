-- ============================================
-- 1️⃣ Allow NULLs in foreign key columns
-- ============================================
ALTER TABLE branches MODIFY inventory_id INT NULL DEFAULT NULL;
ALTER TABLE branches MODIFY location_id INT NULL DEFAULT NULL;
ALTER TABLE branches MODIFY manager_id INT NULL DEFAULT NULL;
ALTER TABLE branches MODIFY warehouse_id INT NULL DEFAULT NULL;

ALTER TABLE warehouses MODIFY location_id INT NULL DEFAULT NULL;
ALTER TABLE warehouses MODIFY manager_id INT NULL DEFAULT NULL;
ALTER TABLE warehouses MODIFY inventory_id INT NULL DEFAULT NULL;

ALTER TABLE products MODIFY supplier_id INT NULL DEFAULT NULL;

ALTER TABLE assistants MODIFY branch_id INT NULL DEFAULT NULL;
ALTER TABLE assistants MODIFY warehouse_id INT NULL DEFAULT NULL;

ALTER TABLE sales MODIFY branch_id BIGINT NULL DEFAULT NULL;

ALTER TABLE ord MODIFY supplier_id BIGINT NULL DEFAULT NULL;
ALTER TABLE ord MODIFY branch_id BIGINT NULL DEFAULT NULL;
-- ============================================
-- 2️⃣ Sample data
-- ============================================

-- INVENTORIES
INSERT INTO inventories (inventory_id, inventory_name, capacity_volume, creation_date) VALUES
(1, 'Central Storage', 5000, '2023-01-10'),
(2, 'North Depot', 3500, '2023-03-22'),
(3, 'South Stock', 4200, '2023-05-17'),
(4, 'Warehouse Alpha', 2500, '2023-06-03'),
(5, 'Warehouse Beta', 2800, '2023-07-19'),
(6, 'Main Storage', 4800, '2023-08-14'),
(7, 'Downtown Reserve', 3000, '2023-09-09'),
(8, 'Regional Hub', 3700, '2023-10-05'),
(9, 'Secondary Storage', 2900, '2023-11-01'),
(10, 'Backup Inventory', 3300, '2023-12-12');

-- MANAGERS
INSERT INTO managers (manager_id, first_name, last_name, address, phone, email) VALUES
(1, 'Laura', 'Ramirez', 'Av 10 #23-45', '3109987654', 'laura.ramirez@email.com'),
(2, 'Carlos', 'Vega', 'Calle 45 #56-78', '3112233445', 'carlos.vega@email.com'),
(3, 'Julian', 'Moreno', 'Cra 12 #34-90', '3123344556', 'julian.moreno@email.com'),
(4, 'Sandra', 'Torres', 'Av 5 #22-33', '3134455667', 'sandra.torres@email.com'),
(5, 'Andres', 'Gutierrez', 'Calle 8 #44-55', '3145566778', 'andres.gutierrez@email.com'),
(6, 'Maria', 'Soto', 'Cra 9 #99-11', '3156677889', 'maria.soto@email.com'),
(7, 'Jorge', 'Reyes', 'Av 30 #10-20', '3167788990', 'jorge.reyes@email.com'),
(8, 'Lucia', 'Lopez', 'Calle 40 #12-45', '3178899001', 'lucia.lopez@email.com'),
(9, 'Paula', 'Mendez', 'Cra 20 #13-70', '3189900112', 'paula.mendez@email.com'),
(10, 'Diego', 'Rojas', 'Av 100 #10-90', '3191011223', 'diego.rojas@email.com');

-- SUPPLIERS
INSERT INTO suppliers (supplier_id, name, phone, email) VALUES
(1, 'Distribuciones ABC', '3101112233', 'contacto@abc.com'),
(2, 'Proveedor Andes', '3202223344', 'ventas@andes.com'),
(3, 'Suministros del Norte', '3303334455', 'info@norte.com'),
(4, 'Productos Express', '3404445566', 'servicio@express.com'),
(5, 'Global Trade', '3505556677', 'sales@globaltrade.com'),
(6, 'Alimentos del Sur', '3606667788', 'contacto@alimentosur.com'),
(7, 'Tecnoproveeduría', '3707778899', 'info@tecno.com'),
(8, 'Mercantil XYZ', '3808889900', 'ventas@xyz.com'),
(9, 'Industrial Omega', '3909990011', 'omega@industria.com'),
(10, 'Comercial Delta', '3010001122', 'delta@comercial.com');

-- LOCATIONS
INSERT INTO locations (location_id, country, state, city, zone, neighborhood, address) VALUES
(1, 'Colombia', 'Cundinamarca', 'Bogotá', 'Centro', 'Chapinero', 'Av 10 #45-33'),
(2, 'Colombia', 'Antioquia', 'Medellín', 'Sur', 'El Poblado', 'Cra 32 #11-22'),
(3, 'Colombia', 'Valle', 'Cali', 'Norte', 'Granada', 'Calle 8 #55-66'),
(4, 'Colombia', 'Santander', 'Bucaramanga', 'Centro', 'Cabecera', 'Cra 9 #22-11'),
(5, 'Colombia', 'Atlantico', 'Barranquilla', 'Oeste', 'Alameda', 'Av 15 #23-44'),
(6, 'Colombia', 'Bolivar', 'Cartagena', 'Centro', 'Getsemaní', 'Calle 12 #8-19'),
(7, 'Colombia', 'Risaralda', 'Pereira', 'Sur', 'Alamos', 'Cra 6 #21-70'),
(8, 'Colombia', 'Tolima', 'Ibagué', 'Norte', 'Interlaken', 'Calle 60 #8-24'),
(9, 'Colombia', 'Meta', 'Villavicencio', 'Centro', 'La Esperanza', 'Cra 20 #15-50'),
(10, 'Colombia', 'Boyacá', 'Tunja', 'Sur', 'Centro', 'Av 5 #9-33');

-- WAREHOUSES
INSERT INTO warehouses (warehouse_id, warehouse_name, location_id, manager_id, inventory_id) VALUES
(1, 'Central Warehouse', NULL, NULL, NULL),
(2, 'North Warehouse', NULL, NULL, NULL),
(3, 'South Warehouse', NULL, NULL, NULL),
(4, 'Main Distribution', NULL, NULL, NULL),
(5, 'Storage A', NULL, NULL, NULL),
(6, 'Storage B', NULL, NULL, NULL),
(7, 'Storage C', NULL, NULL, NULL),
(8, 'Express Depot', NULL, NULL, NULL),
(9, 'Regional Center', NULL, NULL, NULL),
(10, 'Backup Depot', NULL, NULL, NULL);

-- BRANCHES
INSERT INTO branches (branch_id, branch_name, contact_name, employee_count, branch_address, manager_id, warehouse_id, inventory_id, location_id) VALUES
(1, 'Mi Tiendita', 'Saul Tienditas', 5, 'Cra 10 #23-45', NULL, NULL, NULL, NULL),
(2, 'Super Market Centro', 'Ana Morales', 12, 'Av 12 #34-56', NULL, NULL, NULL, NULL),
(3, 'La Esquinita', 'Jorge Perez', 4, 'Calle 45 #67-78', NULL, NULL, NULL, NULL),
(4, 'Mini Abarrotes Doña Luz', 'Luz Ramirez', 6, 'Cra 20 #12-34', NULL, NULL, NULL, NULL),
(5, 'Express Norte', 'Daniel Castillo', 8, 'Calle 33 #22-44', NULL, NULL, NULL, NULL),
(6, 'Mercado del Sur', 'Carolina Rojas', 10, 'Av 80 #10-11', NULL, NULL, NULL, NULL),
(7, 'Bodega Central', 'Felipe Torres', 15, 'Cra 15 #20-25', NULL, NULL, NULL, NULL),
(8, 'Tienda 24 Horas', 'Monica Alvarez', 7, 'Av 40 #10-22', NULL, NULL, NULL, NULL),
(9, 'El Descuento Feliz', 'Juan Mejia', 9, 'Calle 70 #33-55', NULL, NULL, NULL, NULL),
(10, 'Super Ahorro', 'Natalia Rivera', 11, 'Cra 100 #45-67', NULL, NULL, NULL, NULL);

-- PRODUCTS
INSERT INTO products (product_id, supplier_id, product_name, product_weight, product_price) VALUES
(1, NULL, 'Arroz Diana 1kg', 1.0, 3500),
(2, NULL, 'Azúcar Manuelita 1kg', 1.0, 4000),
(3, NULL, 'Aceite Premier 1L', 1.0, 9000),
(4, NULL, 'Café Aguila Roja 500g', 0.5, 8500),
(5, NULL, 'Leche Alquería 1L', 1.0, 3800),
(6, NULL, 'Sal Refisal 1kg', 1.0, 2500),
(7, NULL, 'Pan Bimbo', 0.4, 5500),
(8, NULL, 'Margarina Rama 250g', 0.25, 3000),
(9, NULL, 'Huevos AA 12un', 0.7, 12000),
(10, NULL, 'Pasta Doria 500g', 0.5, 4200);