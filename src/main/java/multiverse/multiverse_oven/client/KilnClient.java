package multiverse.multiverse_oven.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import multiverse.multiverse_oven.Kiln;

public class KilnClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ScreenRegistry.register(Kiln.OVEN_SCREEN_HANDLER, KilnScreen::new);
	}
}
