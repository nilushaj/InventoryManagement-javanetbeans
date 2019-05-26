-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 04, 2017 at 06:34 PM
-- Server version: 5.1.53
-- PHP Version: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sampathstores`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminfl`
--

CREATE TABLE IF NOT EXISTS `adminfl` (
  `User_ID` varchar(10) NOT NULL DEFAULT '',
  `User_Name` varchar(15) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `Contact_No` varchar(10) NOT NULL,
  PRIMARY KEY (`User_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminfl`
--

INSERT INTO `adminfl` (`User_ID`, `User_Name`, `Password`, `Contact_No`) VALUES
('sv4', 'Test', '', '-'),
('sv0', 'Nilusha Jeson', '1234', '0778026844'),
('sv1', 'C. Kulathunga', '123', '-');

-- --------------------------------------------------------

--
-- Table structure for table `invfl`
--

CREATE TABLE IF NOT EXISTS `invfl` (
  `invno` int(10) NOT NULL,
  `invdate` varchar(50) NOT NULL,
  `itemcd` int(11) NOT NULL,
  `Item_Name` varchar(50) NOT NULL,
  `Item_Qnt` float(10,2) NOT NULL,
  `Net_Price` float(10,2) NOT NULL,
  `Discount` float(4,2) NOT NULL,
  `Price` float(12,2) NOT NULL,
  `payterm` varchar(15) NOT NULL,
  `cardno` varchar(30) NOT NULL,
  `status` varchar(10) NOT NULL,
  `Issued_By` varchar(10) NOT NULL,
  PRIMARY KEY (`invno`,`invdate`,`itemcd`),
  KEY `itemcd` (`itemcd`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `invfl`
--

INSERT INTO `invfl` (`invno`, `invdate`, `itemcd`, `Item_Name`, `Item_Qnt`, `Net_Price`, `Discount`, `Price`, `payterm`, `cardno`, `status`, `Issued_By`) VALUES
(8, '2017-01-21 09:47:06', 2, 'Lux', 3.00, 40.00, 0.00, 120.00, 'Cash', '', '', 'sv0'),
(8, '2017-01-21 09:47:06', 1, 'Sugar', 2.00, 100.00, 2.00, 196.00, 'Cash', '', '', 'sv0'),
(7, '2017-01-20 22:33:46', 4, 'Milk', 2.00, 270.00, 0.50, 537.30, 'Cash', '', '', 'sv0'),
(6, '2017-01-20 22:18:46', 1, 'Sugar', 2.00, 100.00, 2.00, 196.00, 'Cash', '', '', 'sv0'),
(5, '2017-01-20 22:18:12', 4, 'Milk', 2.00, 270.00, 0.00, 540.00, 'Cash', '', '', 'sv0'),
(4, '2017-01-20 22:15:03', 4, 'Milk', 4.00, 270.00, 0.00, 1080.00, 'Cash', '', '', 'sv0'),
(4, '2017-01-20 22:15:03', 3, 'Rice', 2.00, 80.00, 1.00, 158.40, 'Cash', '', '', 'sv0'),
(3, '2017-01-20 22:08:56', 1, 'Sugar', 2.00, 100.00, 2.00, 196.00, 'Cash', '', '', 'sv0'),
(3, '2017-01-20 22:08:56', 2, 'Lux', 4.00, 40.00, 0.00, 160.00, 'Cash', '', '', 'sv0'),
(2, '2017-01-20 21:58:43', 3, 'Rice', 4.00, 80.00, 1.00, 316.80, 'Credit Card', '232134', 'visa', 'sv0'),
(2, '2017-01-20 21:58:43', 2, 'Lux', 3.00, 40.00, 0.00, 120.00, 'Credit Card', '232134', 'visa', 'sv0'),
(1, '2017-01-20 21:58:28', 1, 'Sugar', 3.00, 100.00, 2.00, 294.00, 'Cash', '', '', 'sv0'),
(9, '2017-02-15 21:10:54', 1, 'Sugar', 3.00, 100.00, 2.00, 294.00, 'Cash', '', '', 'sv0'),
(9, '2017-02-15 21:10:54', 2, 'Lux', 3.00, 40.00, 0.00, 120.00, 'Cash', '', '', 'sv0');

-- --------------------------------------------------------

--
-- Table structure for table `itemfl`
--

CREATE TABLE IF NOT EXISTS `itemfl` (
  `itemcd` int(10) NOT NULL,
  `itemname` varchar(50) NOT NULL,
  `itemcatg` varchar(30) NOT NULL,
  `packsize` float(10,2) NOT NULL,
  `buyprice` float(10,2) NOT NULL,
  `sellprice` float(10,2) NOT NULL,
  `discount` float(10,2) NOT NULL DEFAULT '0.00',
  `maxqty` float NOT NULL,
  `minqty` float NOT NULL,
  `supcd` int(10) NOT NULL,
  PRIMARY KEY (`itemcd`),
  KEY `supcd` (`supcd`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='item master file';

--
-- Dumping data for table `itemfl`
--

INSERT INTO `itemfl` (`itemcd`, `itemname`, `itemcatg`, `packsize`, `buyprice`, `sellprice`, `discount`, `maxqty`, `minqty`, `supcd`) VALUES
(1, 'Sugar', 'food', 191.00, 90.00, 100.00, 2.00, 200, 25, 1),
(2, 'Lux', 'beauty', 164.00, 35.00, 40.00, 0.00, 1000, 50, 2),
(3, 'Rice', 'food', 180.00, 75.00, 80.00, 1.00, 400, 50, 2),
(4, 'Milk', 'Food', 42.00, 260.00, 270.00, 0.50, 100, 20, 1);

-- --------------------------------------------------------

--
-- Table structure for table `supfl`
--

CREATE TABLE IF NOT EXISTS `supfl` (
  `supcd` int(10) NOT NULL AUTO_INCREMENT,
  `supname` varchar(70) NOT NULL,
  `add1` varchar(50) NOT NULL,
  `add2` varchar(50) NOT NULL,
  `add3` varchar(50) NOT NULL,
  `contno` varchar(10) NOT NULL,
  `remark` varchar(10) NOT NULL,
  `status` varchar(10) NOT NULL,
  PRIMARY KEY (`supcd`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COMMENT='supplier master table' AUTO_INCREMENT=3 ;

--
-- Dumping data for table `supfl`
--

INSERT INTO `supfl` (`supcd`, `supname`, `add1`, `add2`, `add3`, `contno`, `remark`, `status`) VALUES
(1, 'Karunadhasa', 'Colombo', '-', '-', '0112344563', 'Material', '^'),
(2, 'DeSilva Group (Pvt) Ltd', 'Ja-ela', 'Badulla', 'Dehiaththakandiya', '0114595062', 'All items', '^');

-- --------------------------------------------------------

--
-- Table structure for table `userfl`
--

CREATE TABLE IF NOT EXISTS `userfl` (
  `User_ID` varchar(10) NOT NULL,
  `User_Name` varchar(15) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `Contact_No` varchar(10) NOT NULL,
  PRIMARY KEY (`User_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userfl`
--

INSERT INTO `userfl` (`User_ID`, `User_Name`, `Password`, `Contact_No`) VALUES
('sv3', 'Chaminda Kulath', '123', '0114595062');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `itemfl`
--
ALTER TABLE `itemfl`
  ADD CONSTRAINT `itemfl_ibfk_1` FOREIGN KEY (`supcd`) REFERENCES `supfl` (`supcd`) ON DELETE NO ACTION ON UPDATE CASCADE;
