-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 10, 2024 at 04:19 PM
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
-- Database: `icms`
--

-- --------------------------------------------------------

--
-- Table structure for table `acceptor`
--

CREATE TABLE `acceptor` (
  `fname` varchar(600) NOT NULL,
  `lname` varchar(600) NOT NULL,
  `ContactNo` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `acceptor`
--

INSERT INTO `acceptor` (`fname`, `lname`, `ContactNo`) VALUES
('Neenu ', 'Kurian', ' 9988776611'),
('Anju', 'Varghese', '08590280973'),
('James', 'Varghese', '2147483647'),
('Neenu ', 'Kurian', '9988776611'),
('Bindhu', 'N', '998877665500'),
('James', 'Varghese', '998877665544');

-- --------------------------------------------------------

--
-- Table structure for table `donation`
--

CREATE TABLE `donation` (
  `fname` varchar(60) NOT NULL,
  `lname` varchar(600) NOT NULL,
  `ContactNo` varchar(600) NOT NULL,
  `Alternatecontactno` varchar(600) NOT NULL,
  `email` varchar(600) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `donation`
--

INSERT INTO `donation` (`fname`, `lname`, `ContactNo`, `Alternatecontactno`, `email`) VALUES
('Amy', 'George', '94623417863', '99562341785', 'amy2007@gmail.com'),
('Pallavi', 'Ravindran', '95623417863', '89562341785', 'pallavi@123gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `firstpage`
--

CREATE TABLE `firstpage` (
  `Username` varchar(60) NOT NULL,
  `Email` varchar(60) NOT NULL,
  `Password` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `firstpage`
--

INSERT INTO `firstpage` (`Username`, `Email`, `Password`) VALUES
('Anu', 'Anu123@gmail.com', 'anu###123'),
('Allen', 'avallenjoseph1234@gmail.com', '123@123'),
('Kripa M Joseph', 'kripamariamjoseph444@gmail.com', 'kmj'),
('Kripa M Joseph', 'kripamariamjoseph@gmail.com', 'kmj@2005'),
('Kripa M Joseph', 'kripamjoseph.b23ec1136@mbcet.ac.in', 'kmj@2005');

-- --------------------------------------------------------

--
-- Table structure for table `hospital`
--

CREATE TABLE `hospital` (
  `fname` varchar(600) NOT NULL,
  `lname` varchar(600) NOT NULL,
  `Contactno` varchar(600) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hospital`
--

INSERT INTO `hospital` (`fname`, `lname`, `Contactno`) VALUES
('Jacob', 'John', '8877665599'),
('Neenu', 'Kurian', '9988776611'),
('James', 'Thomas', '9988776622'),
('Bindhu', 'V', '9988776633'),
('Anju', 'Kurian', '9988776644'),
('James', 'Vargheese', '9988776655');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `acceptor`
--
ALTER TABLE `acceptor`
  ADD PRIMARY KEY (`ContactNo`);

--
-- Indexes for table `donation`
--
ALTER TABLE `donation`
  ADD PRIMARY KEY (`ContactNo`);

--
-- Indexes for table `firstpage`
--
ALTER TABLE `firstpage`
  ADD PRIMARY KEY (`Email`);

--
-- Indexes for table `hospital`
--
ALTER TABLE `hospital`
  ADD PRIMARY KEY (`Contactno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
