-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Gegenereerd op: 26 mrt 2019 om 15:31
-- Serverversie: 10.1.35-MariaDB
-- PHP-versie: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_3_eindopdr_2`
--
CREATE DATABASE IF NOT EXISTS `java_3_eindopdr_2` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `java_3_eindopdr_2`;

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `persons`
--

CREATE TABLE `persons` (
  `firstname` varchar(25) NOT NULL,
  `lastname` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `persons`
--

INSERT INTO `persons` (`firstname`, `lastname`) VALUES
('Mr', 'Meeseeks'),
('Mr', 'Meeseeks'),
('Mr', 'Meeseeks'),
('Mr', 'Meeseeks'),
('Mr', 'Meeseeks');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
