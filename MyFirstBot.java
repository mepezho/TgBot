package org.example.bot;

import io.github.natanimn.BotClient;
import io.github.natanimn.types.InlineKeyboardButton;
import io.github.natanimn.types.InlineKeyboardMarkup;
import io.github.natanimn.types.ReplyKeyboardMarkup;

public class MyFirstBot {
    private static final String token = "8074830694:AAGzDmdoAOyI1ZdCOvAPHMhVKf2xT2y_1Uo";
    public MyFirstBot() {
        final BotClient bot = new BotClient(token);

        bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
            context.reply("Hi!").exec();
        });

        bot.onMessage(filter -> filter.regex("^Прив.*")
            , (context, message)->{

                    InlineKeyboardMarkup markup = new InlineKeyboardMarkup(new InlineKeyboardButton[][]{
                            new InlineKeyboardButton[]{
                                    new InlineKeyboardButton("A").callbackData("a"),
                                    new InlineKeyboardButton("B").callbackData("b")
                            },
                            new InlineKeyboardButton[]{
                                    new InlineKeyboardButton("site").url("itcube62.ru")
                            }
                    });

                    context.sendMessage("hh").replyMarkup(markup).exec();
                });

        bot.onMessage(filter -> filter.commands("menu")
                , (context, message)->{
                    ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                    markup.add("A", "B", "C");
                    markup.add("D");
                    markup.add("E", "F");

                    context.sendMessage("Menu").replyMarkup(markup).exec();
                });

        bot.run();
    }
}
