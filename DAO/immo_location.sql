-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : mer. 05 jan. 2022 à 18:09
-- Version du serveur :  10.4.17-MariaDB
-- Version de PHP : 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `immo_location`
--

-- --------------------------------------------------------

--
-- Structure de la table `Authentification`
--

CREATE TABLE `Authentification` (
  `nom_usr` varchar(234) NOT NULL,
  `mdp` varchar(34) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `Authentification`
--

INSERT INTO `Authentification` (`nom_usr`, `mdp`) VALUES
('auxi', 'auxi');

-- --------------------------------------------------------

--
-- Structure de la table `Facture`
--

CREATE TABLE `Facture` (
  `id_facture` int(10) NOT NULL,
  `idLocataire` int(10) NOT NULL,
  `typePropriete` int(10) NOT NULL,
  `caution` int(11) NOT NULL,
  `dure_contrat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `Locataire`
--

CREATE TABLE `Locataire` (
  `ncni` int(11) NOT NULL,
  `nom` varchar(234) NOT NULL,
  `prenom` varchar(32) NOT NULL,
  `telephone` int(11) NOT NULL,
  `profession` varchar(233) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `Payer`
--

CREATE TABLE `Payer` (
  `id` int(11) NOT NULL,
  `date` varchar(234) NOT NULL,
  `montant` int(11) NOT NULL,
  `idFacture` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `Propriete`
--

CREATE TABLE `Propriete` (
  `id_propriete` int(11) NOT NULL,
  `typePropriete` int(11) NOT NULL,
  `prix_mensuel` int(11) NOT NULL,
  `description` varchar(255) NOT NULL,
  `localisation` varchar(234) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `Status`
--

CREATE TABLE `Status` (
  `id_status` int(11) NOT NULL,
  `status` varchar(23) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `Status`
--

INSERT INTO `Status` (`id_status`, `status`) VALUES
(1, 'Occuper'),
(2, 'Disponible');

-- --------------------------------------------------------

--
-- Structure de la table `Type_propriete`
--

CREATE TABLE `Type_propriete` (
  `id_type` int(11) NOT NULL,
  `type` varchar(123) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `Type_propriete`
--

INSERT INTO `Type_propriete` (`id_type`, `type`) VALUES
(1, 'Maison'),
(2, 'Boutique');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `Authentification`
--
ALTER TABLE `Authentification`
  ADD PRIMARY KEY (`mdp`);

--
-- Index pour la table `Facture`
--
ALTER TABLE `Facture`
  ADD PRIMARY KEY (`id_facture`),
  ADD KEY `fk_Locataire_ncni` (`idLocataire`),
  ADD KEY `fk_Type_propriete` (`typePropriete`);

--
-- Index pour la table `Locataire`
--
ALTER TABLE `Locataire`
  ADD PRIMARY KEY (`ncni`);

--
-- Index pour la table `Payer`
--
ALTER TABLE `Payer`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_Facture` (`idFacture`);

--
-- Index pour la table `Propriete`
--
ALTER TABLE `Propriete`
  ADD PRIMARY KEY (`id_propriete`),
  ADD KEY `fk_Type` (`typePropriete`),
  ADD KEY `fk_Status` (`status`);

--
-- Index pour la table `Status`
--
ALTER TABLE `Status`
  ADD PRIMARY KEY (`id_status`);

--
-- Index pour la table `Type_propriete`
--
ALTER TABLE `Type_propriete`
  ADD PRIMARY KEY (`id_type`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `Facture`
--
ALTER TABLE `Facture`
  MODIFY `id_facture` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Payer`
--
ALTER TABLE `Payer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Propriete`
--
ALTER TABLE `Propriete`
  MODIFY `id_propriete` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Status`
--
ALTER TABLE `Status`
  MODIFY `id_status` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `Type_propriete`
--
ALTER TABLE `Type_propriete`
  MODIFY `id_type` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `Facture`
--
ALTER TABLE `Facture`
  ADD CONSTRAINT `fk_Locataire_ncni` FOREIGN KEY (`idLocataire`) REFERENCES `Locataire` (`ncni`),
  ADD CONSTRAINT `fk_Type_propriete` FOREIGN KEY (`typePropriete`) REFERENCES `Type_propriete` (`id_type`);

--
-- Contraintes pour la table `Payer`
--
ALTER TABLE `Payer`
  ADD CONSTRAINT `fk_Facture` FOREIGN KEY (`idFacture`) REFERENCES `Facture` (`id_facture`);

--
-- Contraintes pour la table `Propriete`
--
ALTER TABLE `Propriete`
  ADD CONSTRAINT `fk_Status` FOREIGN KEY (`status`) REFERENCES `Status` (`id_status`),
  ADD CONSTRAINT `fk_Type` FOREIGN KEY (`typePropriete`) REFERENCES `Type_propriete` (`id_type`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
