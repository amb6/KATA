package com.gildedrose;

public class Item {

	public String name;

	public int sellIn;

	public int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}

	// ***************************************
	public void updateQuality() {

		this.sellIn--;

		if (this.sellIn >= 0 && this.quality > 0) {
			this.quality--;
		}

		if (this.sellIn < 0 && this.quality > 0) {
			this.quality = this.quality - 2;

		}

		if (this.quality < 0) {
			this.quality = 0;
		}
	}
}
