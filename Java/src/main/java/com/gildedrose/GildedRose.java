package com.gildedrose;

import java.util.Arrays;
import java.util.stream.Stream;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		Stream<Item> itemTostream = Arrays.stream(items);
		itemTostream.forEach(item -> item.updateQuality());
	}
}