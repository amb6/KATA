package com.gildedrose;

public class AgedBrie extends Item {

	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateQuality() {
		this.sellIn--;
		if (this.quality < 50) {
			this.quality++;
		}
	}

}
