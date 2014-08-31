package net.chendriksen.pickuplinepro;

import java.util.Random;

public class LineBook {

    // Member variable (properties about the object)
    public String[] mLines = {
            "If you were a fruit you'd be a FINEAPPLE.",
            "If you were a flower, you'd be a DAMNdelion!",
            "Are you French?\n\nCause Madamn.",
            "You're a 9 out of 10 and I'm the 1 you need.",
            "Are you an antiquer? Cause I have some junk that hasn't been touched in years.",
            "Are you my appendix? I don't know what you do or how you work but I feel like I should take you out.",
            "Oh whoops, oooh. I dropped my monster condom that I use for my magnum dong.",
            "Hey did you drop something?\n\nUhhm, I don't think so....\n\nYour standards, Hi! I'm Nick",
            "Nice legs. What time do they open?",
            "GET IN THE VAN!",
            "You hear about Pluto? Another planet will be gone after I destroy Uranus.",
            "Is your daddy a baker? Cause you got a nice set of buns.",
            "Can I buy you a drink or do you just want the money?",
            "Does this rag smell like chloroform?",
            "Are those space pants you're wearing? Because your ass is out of this world.",
            "Are you sitting on that F5 key? Because that ass is refreshing.",
            "Is your name homework? 'Cause I'm not doing you but I should be.",
            "Are you the Gulf of Mexico? Because I wanna drill you & make a huge mess.",
            "There's a big sale in my bedroom right now. Clothes are 100% off!",
            "Are you my big toe? Because I would bang you against every piece of furniture in my apartment.",
            "I'm not really this tall, I'm just sitting on my wallet.",
            "I put the STD in stud. All I need is you.",
            "Have you got pet insurance because I'm going to ruin that pussy.",
            "We're you forged in the fires of Mt. Doom? 'cause you're precious.",
            "Do you work at subway, cause you just gave me a footlong.",
            "If I said you had a nice body would you hold it against me?",
            "What's the difference between a Ferrari and an erection? I don't have a Ferrari.",
            "Nice shoes, wanna fuck?",
            "I'm going home to have sex, who's coming with me?",
            "That shirt is very becoming on you, but then if I were on you, I'd be coming too.",
            "Wanna make a seafood palette? You bring your mussels back to my place and I'll show you my clam.",
            "I just ate my cat for dinner, but I'm still hungry for pussy.",
            "You look like a hard worker. I have an opening you could fill.",
            "If I flip a coin, what are the chances of me getting head?",
            "Do you know what'd look good on you? Me.",
            "Are you a fireman? Because you turn the hoes on.",
            "Let's have sex.",
            "Feel my sweater. Know what it's made of?\n\nBoyfriend material.",
            "Are you a beaver?\n\nCuz dam.",
            "Someone farted, let's get out of here.",
            "If you need a place to crash I have a couch... \n\nit doesn't pull out, but I do",
            "Is my vagina crying, or are you just sexy?",
            "I would like to extend to you an invitation to the pants party.",
            "I'm a Pokemon master. \n\nThat makes me more than qualified to handle your jiggly puffs.",
            "Roses are red\nViolets are blue\nI'm using my hand\nBut I'm thinking of you",
            "My magic watch says you're not wearing any panties. \n\n...Well it's wrong.\n\nOh it must be running 20 minutes fast.",
            "If I could rearrange the alphabet I'd put U and I a few letters apart. Because I still want you to have your space.",
            "Hey girl, is your name Google? Cause you've got everything I'm searching for.",
            "Are you an archaeologist?\n\nbecause ive got a very large bone for you to examine",
            "You got an inhaler?\n\nCuz I heard u got that dat ass ma.",
            "I am wasted.\n\nBut the condom in my wallet doesn't have to be.",
            "Wanna come back to my place and watch porn on my 52\" flat-screen mirror?",
            "Are your parents retarded?\n\nBecause I think you're special.",
            "I find you attractive and would like to date you",
            "Are you made of LSD?\n\n'Cause you got me trippin'",
            "They call me Coffee, 'cause I grind so fine.",
            "My friend tells me you're easy."

    };

    private int oldNumber = 0;

    // Method (abilities: things the object can do)
    public String getLine() {

        String line = "";
        int randomNumber = oldNumber;

        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new random number generator

        while (randomNumber == oldNumber) {
            randomNumber = randomGenerator.nextInt(mLines.length);
        }

        // Convert the randomNumber to a text fact
        line = mLines[randomNumber];
        oldNumber = randomNumber;

        return line;
    }
}

