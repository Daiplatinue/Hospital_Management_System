-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2024 at 06:30 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `a_logs`
--

CREATE TABLE `a_logs` (
  `a_id` int(50) NOT NULL,
  `u_id` int(50) NOT NULL,
  `a_actions` varchar(50) DEFAULT NULL,
  `a_date` date DEFAULT NULL,
  `a_hhmmss` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `diagnostics`
--

CREATE TABLE `diagnostics` (
  `d_id` int(50) NOT NULL,
  `a_id` int(50) NOT NULL,
  `d_diagnosis` varchar(50) DEFAULT NULL,
  `d_description` varchar(250) DEFAULT NULL,
  `d_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `donations`
--

CREATE TABLE `donations` (
  `ds_id` int(50) NOT NULL,
  `ds_mop` varchar(50) NOT NULL,
  `ds_value` int(50) NOT NULL,
  `ds_sender` varchar(50) NOT NULL,
  `ds_description` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `d_appointments`
--

CREATE TABLE `d_appointments` (
  `a_id` int(50) NOT NULL,
  `p_lastname` varchar(50) DEFAULT NULL,
  `p_firstname` varchar(50) DEFAULT NULL,
  `a_contact` varchar(50) NOT NULL,
  `u_id` int(50) NOT NULL,
  `a_date` date NOT NULL,
  `a_hours` int(50) NOT NULL,
  `a_mins` int(50) NOT NULL,
  `a_time` varchar(50) NOT NULL,
  `a_status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `l_slideshow`
--

CREATE TABLE `l_slideshow` (
  `l_images` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `l_slideshow`
--

INSERT INTO `l_slideshow` (`l_images`) VALUES
('src/com/slideshow/p1.jpg'),
('src/com/slideshow/p3.jpg'),
('src/com/slideshow/p4.jpg'),
('src/com/slideshow/p5.jpg'),
('src/com/slideshow/p2.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `n_comers`
--

CREATE TABLE `n_comers` (
  `n_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `u_tbl`
--

CREATE TABLE `u_tbl` (
  `u_id` int(50) NOT NULL,
  `u_username` varchar(50) DEFAULT NULL,
  `u_email` varchar(50) DEFAULT NULL,
  `u_password` varchar(50) DEFAULT NULL,
  `u_question` varchar(50) DEFAULT NULL,
  `u_answer` varchar(50) DEFAULT NULL,
  `u_type` varchar(50) DEFAULT NULL,
  `u_status` varchar(50) DEFAULT NULL,
  `u_contact` varchar(50) DEFAULT NULL,
  `u_lastname` varchar(50) DEFAULT NULL,
  `u_firstname` varchar(50) DEFAULT NULL,
  `u_gender` varchar(50) DEFAULT NULL,
  `u_profile` varchar(50) DEFAULT NULL,
  `u_cover` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `a_logs`
--
ALTER TABLE `a_logs`
  ADD PRIMARY KEY (`a_id`),
  ADD KEY `U_pk` (`u_id`);

--
-- Indexes for table `diagnostics`
--
ALTER TABLE `diagnostics`
  ADD PRIMARY KEY (`d_id`),
  ADD KEY `fk a_id` (`a_id`);

--
-- Indexes for table `donations`
--
ALTER TABLE `donations`
  ADD PRIMARY KEY (`ds_id`);

--
-- Indexes for table `d_appointments`
--
ALTER TABLE `d_appointments`
  ADD PRIMARY KEY (`a_id`),
  ADD KEY `u_doctor` (`u_id`);

--
-- Indexes for table `n_comers`
--
ALTER TABLE `n_comers`
  ADD PRIMARY KEY (`n_id`),
  ADD KEY `u_pk` (`u_id`);

--
-- Indexes for table `u_tbl`
--
ALTER TABLE `u_tbl`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `a_logs`
--
ALTER TABLE `a_logs`
  MODIFY `a_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `diagnostics`
--
ALTER TABLE `diagnostics`
  MODIFY `d_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `donations`
--
ALTER TABLE `donations`
  MODIFY `ds_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `d_appointments`
--
ALTER TABLE `d_appointments`
  MODIFY `a_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `n_comers`
--
ALTER TABLE `n_comers`
  MODIFY `n_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `u_tbl`
--
ALTER TABLE `u_tbl`
  MODIFY `u_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
