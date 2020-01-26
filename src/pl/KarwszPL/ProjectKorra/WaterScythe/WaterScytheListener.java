package pl.KarwszPL.ProjectKorra.WaterScythe;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import java.util.HashMap;

public class WaterScytheListener implements Listener {

    HashMap<Player, Long> shiftStart = new HashMap<>();

    @EventHandler
    public void onSneakToggle(PlayerToggleSneakEvent event){

        Player player = event.getPlayer();
        if (!player.isSneaking()) shiftStart.put(player, System.currentTimeMillis());

    }

    @EventHandler
    public void onSwing(PlayerInteractEvent event) {
        if (event.getAction().equals(Action.LEFT_CLICK_AIR) || event.getAction().equals(Action.LEFT_CLICK_AIR)) {
            Player player = event.getPlayer();
            if (player.isSneaking() && (System.currentTimeMillis() - shiftStart.get(player)) >= 1500) new WaterScythe(player);
        }
    }

}
