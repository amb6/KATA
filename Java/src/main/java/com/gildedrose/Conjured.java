package com.gildedrose;

public class Conjured extends Item {

	public Conjured(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateQuality() {
		if (this.quality > 0) {
			this.quality = this.quality - 2;

		} else {

			this.quality = 0;
		}
	}
}
