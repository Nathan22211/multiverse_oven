package multiverse.multiverse_oven.client;

import multiverse.multiverse_oven.Kiln;
import multiverse.multiverse_oven.KilnScreenHandler;
import net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class KilnScreen extends AbstractFurnaceScreen<KilnScreenHandler> {
	private static final Identifier TEXTURE = new Identifier(Kiln.MODID, "textures/gui/container/kiln.png");

	public KilnScreen(KilnScreenHandler handler, PlayerInventory inventory, Text title) {
		super(handler, new KilnRecipeBookScreen(), inventory, title, TEXTURE);
	}
}
