package org.cyclops.colossalchests.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import org.cyclops.colossalchests.block.PropertyMaterial;
import org.cyclops.cyclopscore.item.ItemBlockMetadata;

import java.util.List;

/**
 * @author rubensworks
 */
public class ItemBlockMaterial extends ItemBlockMetadata {
    /**
     * Make a new instance.
     *
     * @param block The blockState instance.
     */
    public ItemBlockMaterial(Block block) {
        super(block);
    }

    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean par4) {
        int materialIndex = itemStack.getItemDamage();
        if (materialIndex > PropertyMaterial.Type.values().length) {
            materialIndex = (materialIndex - 1) / 2;
        }
        list.add(TextFormatting.BLUE + PropertyMaterial.Type.values()[materialIndex].getLocalizedName());
        super.addInformation(itemStack, entityPlayer, list, par4);

    }
}
