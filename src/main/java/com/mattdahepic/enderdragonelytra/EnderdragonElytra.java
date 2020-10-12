package com.mattdahepic.enderdragonelytra;

import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("enderdragonelytra")
public class EnderdragonElytra {
    public EnderdragonElytra() {
        MinecraftForge.EVENT_BUS.addListener(this::entityDeath);
    }

    public void entityDeath(LivingDeathEvent e) {
        if (e.getEntity() instanceof EnderDragonEntity) {
            EnderDragonEntity d = (EnderDragonEntity) e.getEntity();
            d.world.addEntity(new ItemEntity(d.world,d.getPosX(),d.getPosY(),d.getPosZ(),new ItemStack(Items.ELYTRA)));
        }
    }
}
