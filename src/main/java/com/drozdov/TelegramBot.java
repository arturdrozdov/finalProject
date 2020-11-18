package com.drozdov;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
public class TelegramBot extends TelegramLongPollingBot {
    public TelegramBot() {

        ChatBot.initProfessions();
    }


    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message = update.getMessage().getText();
            String response = ChatBot.process(message);

            sendText(update.getMessage().getChatId(), response);
        }
    }

    private void sendText(long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    public String getBotUsername() {
        return "arturDrozdov1rst_bot";
    }

    @Override
    public String getBotToken() {
        return "1444567843:AAGBZzKSIhFQ84jpKW4SEfWxGU95LYxeGQM";
    }
}
