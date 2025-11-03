CREATE TABLE `inventories` (
  `inventory_id` INT UNIQUE PRIMARY KEY COMMENT 'Primary Key of inventories',
  `inventory_name` VARCHAR(45) NOT NULL,
  `capacity_volume` float NOT NULL,
  `creation_date` date NOT NULL
);

CREATE TABLE `inv_prod` (
  `inventory_id` bigint,
  `product_id` bigint,
  `Quantity` int NOT NULL,
  PRIMARY KEY (`inventory_id`, `product_id`)
);

CREATE TABLE `managers` (
  `manager_id` INT UNIQUE PRIMARY KEY,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL
);

CREATE TABLE `branches` (
  `branch_id` INT NOT NULL,
  `branch_name` VARCHAR(45) NOT NULL,
  `contact_name` VARCHAR(45) NOT NULL,
  `employee_count` INT NOT NULL,
  `branch_address` VARCHAR(45) NOT NULL,
  `manager_id` INT NOT NULL,
  `warehouse_id` INT NOT NULL,
  `inventory_id` INT UNIQUE NOT NULL,
  `location_id` INT UNIQUE NOT NULL,
  PRIMARY KEY (`branch_id`, `manager_id`, `warehouse_id`, `inventory_id`, `location_id`)
);

CREATE TABLE `suppliers` (
  `supplier_id` INT UNIQUE PRIMARY KEY,
  `name` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL
);

CREATE TABLE `locations` (
  `location_id` INT NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `state` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `zone` VARCHAR(45) NOT NULL,
  `neighborhood` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL
);

CREATE TABLE `warehouses` (
  `warehouse_id` INT UNIQUE NOT NULL,
  `warehouse_name` VARCHAR(45) NOT NULL,
  `location_id` INT NOT NULL,
  `manager_id` INT NOT NULL,
  `inventory_id` int UNIQUE NOT NULL,
  PRIMARY KEY (`warehouse_id`, `location_id`, `manager_id`, `inventory_id`)
);

CREATE TABLE `products` (
  `product_id` INT,
  `supplier_id` bigint,
  `product_name` VARCHAR(45) NOT NULL,
  `product_weight` float NOT NULL,
  `product_price` float NOT NULL,
  PRIMARY KEY (`product_id`, `supplier_id`),
  PRIMARY KEY (`product_id`, `supplier_id`)
);

CREATE TABLE `assistants` (
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `warehouse_id` INT,
  `branch_id` INT,
  PRIMARY KEY (`branch_id`, `warehouse_id`)
);

CREATE TABLE `sales` (
  `sale_id` bigserial,
  `branch_id` bigint,
  `quantity` bigint NOT NULL,
  `tax` float NOT NULL,
  `subtotal` float NOT NULL,
  `discount` float NOT NULL,
  `value` float NOT NULL
);

CREATE TABLE `order` (
  `order_id` bigserial,
  `value` float NOT NULL,
  `tax` float NOT NULL,
  `date_order` date NOT NULL,
  `date_delivered` date NOT NULL,
  `supplier_id` bigint,
  `branch_id` bigint,
  PRIMARY KEY (`supplier_id`, `branch_id`)
);

CREATE TABLE `ord_prod` (
  `order_id` int,
  `product_id` int,
  `quantity` int NOT NULL,
  `subtotal` float NOT NULL
);

CREATE TABLE `sales_prod` (
  `sale_id` bigint,
  `product_id` bigint,
  `quantity` bigint NOT NULL
);

ALTER TABLE `inv_prod` ADD FOREIGN KEY (`inventory_id`) REFERENCES `inventories` (`inventory_id`);

ALTER TABLE `inv_prod` ADD FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`);

ALTER TABLE `branches` ADD FOREIGN KEY (`manager_id`) REFERENCES `managers` (`manager_id`);

ALTER TABLE `warehouses` ADD FOREIGN KEY (`warehouse_id`) REFERENCES `branches` (`warehouse_id`);

ALTER TABLE `branches` ADD FOREIGN KEY (`inventory_id`) REFERENCES `inventories` (`inventory_id`);

ALTER TABLE `branches` ADD FOREIGN KEY (`location_id`) REFERENCES `locations` (`location_id`);

ALTER TABLE `warehouses` ADD FOREIGN KEY (`location_id`) REFERENCES `locations` (`location_id`);

ALTER TABLE `warehouses` ADD FOREIGN KEY (`manager_id`) REFERENCES `managers` (`manager_id`);

ALTER TABLE `warehouses` ADD FOREIGN KEY (`inventory_id`) REFERENCES `inventories` (`inventory_id`);

ALTER TABLE `products` ADD FOREIGN KEY (`supplier_id`) REFERENCES `suppliers` (`supplier_id`);

ALTER TABLE `assistants` ADD FOREIGN KEY (`warehouse_id`) REFERENCES `warehouses` (`warehouse_id`);

ALTER TABLE `assistants` ADD FOREIGN KEY (`branch_id`) REFERENCES `branches` (`branch_id`);

ALTER TABLE `sales` ADD FOREIGN KEY (`branch_id`) REFERENCES `branches` (`branch_id`);

ALTER TABLE `order` ADD FOREIGN KEY (`supplier_id`) REFERENCES `suppliers` (`supplier_id`);

ALTER TABLE `order` ADD FOREIGN KEY (`branch_id`) REFERENCES `branches` (`branch_id`);

ALTER TABLE `ord_prod` ADD FOREIGN KEY (`order_id`) REFERENCES `order` (`order_id`);

ALTER TABLE `ord_prod` ADD FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`);

ALTER TABLE `sales_prod` ADD FOREIGN KEY (`sale_id`) REFERENCES `sales` (`sale_id`);

ALTER TABLE `sales_prod` ADD FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`);
