package pl.KarwszPL.ProjectKorra.WaterScythe;

import com.projectkorra.projectkorra.ability.AddonAbility;
import com.projectkorra.projectkorra.ability.WaterAbility;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class WaterScythe extends WaterAbility implements AddonAbility {

    Location origin;
    Vector vector;

    public WaterScythe(Player player) {
        super(player);
        origin = player.getLocation();


    }



    @Override
    public void progress() {

    }

    @Override
    public boolean isSneakAbility() {
        return false;
    }

    @Override
    public boolean isHarmlessAbility() {
        return false;
    }

    @Override
    public long getCooldown() {
        return 3000;
    }

    @Override
    public String getName() {
        return "WaterScythe";
    }

    @Override
    public Location getLocation() {
        return null;
    }

    @Override
    public void load() {
        Bukkit.getPluginManager().registerEvents(new WaterScytheListener(), Bukkit.getPluginManager().getPlugin("ProjectKorra"));
    }

    @Override
    public void stop() {

    }

    @Override
    public String getAuthor() {
        return "KarwszPL";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }
}
