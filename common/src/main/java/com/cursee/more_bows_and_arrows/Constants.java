package com.cursee.more_bows_and_arrows;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oshi.util.tuples.Pair;
import oshi.util.tuples.Triplet;

public class Constants {

	public static final String MOD_ID = "more_bows_and_arrows";
	public static final String MOD_NAME = "More Bows and Arrows";
	public static final String MOD_VERSION = "4.0.0";
	public static final String MC_VERSION_RAW = "[1.20.1]";
	public static final Pair<String, String> PUBLISHER_AUTHOR = new Pair<String, String>("Lupin", "Jason13");
	public static final Triplet<String, String, String> PRIMARY_CURSEFORGE_MODRINTH = new Triplet<String, String, String>("https://www.curseforge.com/members/lupin/projects", "https://www.curseforge.com/members/lupin/projects", "https://modrinth.com/user/Lupin/mods");
	public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
}
