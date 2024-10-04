package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.gamestu.model.Game;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        List<Game> games = new ArrayList<Game>();
        Game game = new Game();
        game.setGame_name("Black Myth: Wukong");
        game.setGame_image("https://shared.akamai.steamstatic.com/store_item_assets/steam/apps/2358720/capsule_616x353.jpg?t=1724238313");
        game.setGame_type("แอคชั่น, ผจญภัย");
        game.setGame_detail("Black Myth: Wukong is an action RPG rooted in Chinese mythology.\n" +
                "The story is based on Journey to the West, one of the Four Great Classical Novels of Chinese literature.\n" +
                "You shall set out as the Destined One to venture into the challenges and marvels ahead, to uncover the obscured truth beneath the veil of a glorious legend from the past.");
        game.setGame_Dev("Game Science");
        game.setGame_price("1800");
        games.add(game);

        Game game2 = new Game();
        game2.setGame_name("inZOI");
        game2.setGame_image("https://wstatic-prod.playinzoi.com/web/live/main_8023d61/static/images/og/inzoi-og-image.jpg");
        game2.setGame_type("ผจญภัย, แคชชวล");
        game2.setGame_detail("\"Every life becomes a story\" Create your unique story by controlling and observing the lives of 'Zois'.\n" +
                "\n" +
                "Customize characters and build houses using inZOI's easy-to-use tools to live the life of your dreams and experience the different emotions of life created by its deep and detailed simulation.");
        game2.setGame_price("0");
        game2.setGame_Dev("KRAFTON, Inc.");
        games.add(game2);

        Game game3 = new Game();
        game3.setGame_name("RAFT");
        game3.setGame_image("https://www.yasir252.com/wp-content/uploads/2022/12/download-raft-full-version-pc-game.jpg");
        game3.setGame_price("369");
        game3.setGame_type("ผจญภัย, อินดี้, บทบาทสมมติ");
        game3.setGame_detail("By yourself or with friends, your mission is to survive an epic oceanic adventure across\n" +
                "a perilous sea! Gather debris to survive, expand your raft and set sail towards forgotten and dangerous islands!\n" +
                "\n" +
                "Trapped on a small raft with nothing but a hook made of old plastic, players awake on a vast,\n" +
                "blue ocean totally alone and with no land in sight! With a dry throat and an empty stomach,\n" +
                "survival will not be easy!\n" +
                "\n" +
                "Raft™ throws you and your friends into an epic adventure out on the big open sea, with the\n" +
                "objective to stay alive, gather resources and build yourself a floating home worthy of\n" +
                "survival.\n" +
                "\n" +
                "Resources are tough to come by at sea: Players will have to make sure to catch whatever debris floats by using their trusty hook and when possible, scavenge the reefs beneath the waves and the islands above.\n" +
                "However, thirst and hunger is not the only danger in the ocean… watch out for the man-\n" +
                "eating shark determined to end your voyage!");
        game3.setGame_Dev("Redbeet Interactive");
        games.add(game3);

        Game game4 = new Game();
        game4.setGame_name("Stardew Valley");
        game4.setGame_image("https://shared.akamai.steamstatic.com/store_item_assets/steam/apps/413150/capsule_616x353.jpg?t=1711128146");
        game4.setGame_price("315");
        game4.setGame_type("อินดี้, สวมบทบาท");
        game4.setGame_detail("You've inherited your grandfather's old farm plot in Stardew Valley.\n" +
                "Armed with hand-me-down tools and a few coins, you set out to begin your new life.\n" +
                "Can you learn to live off the land and turn these overgrown fields into a thriving home?");
        game4.setGame_Dev("ConcernedApe");
        games.add(game4);

        Game game5 = new Game();
        game5.setGame_name("Apex Legends™ ");
        game5.setGame_image("https://assets.vg247.com/current/2019/02/apex_legends_main_art_2.jpg");
        game5.setGame_price("0");
        game5.setGame_detail("Conquer with character in Apex Legends, a free-to-play* Hero shooter where legendary characters with powerful abilities team up to battle for fame & fortune on the fringes of the Frontier.\n" +
                "\n" +
                "Master an ever-growing roster of diverse Legends, deep-tactical squad play, and bold, new innovations that go beyond the Battle Royale experience — all within a rugged world where anything goes. Welcome to the next evolution of Hero Shooter.");
        game5.setGame_Dev("Respawn Entertainment");
        game5.setGame_type("แอคชั่น, เล่นฟรี");
        games.add(game5);

        Game game6 = new Game();
        game6.setGame_name("Grand Theft Auto V");
        game6.setGame_image("https://static1.srcdn.com/wordpress/wp-content/uploads/2020/02/Grand-Theft-Auto-5-Splash-Screen.jpg");
        game6.setGame_price("350");
        game6.setGame_detail("Grand Theft Auto V for PC offers players the option to explore the award-winning world of Los Santos and Blaine County in resolutions of up to 4k and beyond, as well as the chance to experience the game running at 60 frames per second.");
        game6.setGame_Dev("Rockstar North");
        game6.setGame_type("แอคชั้น, ผจญภัย");
        games.add(game6);


        Game game7 = new Game();
        game7.setGame_name("WWE 2K23");
        game7.setGame_image("https://th.bing.com/th/id/R.cdb92827c07cceba79af4a94883c1a13?rik=qgXhzxBpPsFzzw&pid=ImgRaw&r=0");
        game7.setGame_price("1499");
        game7.setGame_detail("Expanded features, gorgeous graphics, and the ultimate WWE experience. Hit the ring with a deep roster of WWE Superstars and Legends including Roman Reigns, \"American Nightmare\" Cody Rhodes, Ronda Rousey, Brock Lesnar, \"Stone Cold\" Steve Austin and more!\n" +
                "•2K SHOWCASE: INTERACTIVE SPORTS DOCUMENTARY\n" +
                "    Play through the key moments and toughest opponents of John Cena’s storied 20-year WWE career. And in a franchise-first, take on the role of each marquee opponent - some of WWE’s greatest of all time - as you aim to take down Mr. Hustle, Loyalty, and Respect.\n" +
                "•IT’S WARGAMES\n" +
                "    This fan-favorite action-packed WarGames makes its debut in WWE 2K23 and delivers heart-pounding 3v3 and 4v4 multiplayer mayhem inside two side-by-side rings, surrounded by a double-steel cage!\n"+
                "•DEFINE YOUR FUTURE IN MyRISE\n" +
                "    Walk through the curtains for your WWE debut and shape your career as a WWE Superstar with the decisions you make along the way through distinct storylines - The Lock and The Legacy.\n" +
                "•THE UNIVERSE IS ALL YOURS\n" +
                "    WWE Universe Mode is the ultimate sandbox that puts you in charge of WWE, from Superstar rosters, feuds, champions, weekly shows, and more!\n" +
                "\n" +
                "*Local support for up to 4 players / Online support for up to 8 players");
        game7.setGame_Dev("Visual Concepts");
        game7.setGame_type("สมมติบทบาท, กีฬา");
        games.add(game7);

        //ส่ง games ไปให้ MyAdapter
        mAdapter = new MyAdapter(games, this);
        recyclerView.setAdapter(mAdapter);

    }
}