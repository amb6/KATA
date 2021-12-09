package com.gildedrose;

public class Sulfuras extends Item {

	public Sulfuras(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	// "Sulfuras", étant un objet légendaire, n'a pas de date de péremption et ne
	// perd jamais en qualité (quality)
	public void updateQuality() {
	}

}
