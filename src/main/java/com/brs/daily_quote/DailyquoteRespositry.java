package com.brs.daily_quote;

import org.springframework.stereotype.Repository;

@Repository
public class DailyquoteRespositry {
    String[] getQuotes() {
        return new String[] {
                "The only way to do great work is to love what you do, Steve Jobs.",
                "In the middle of difficulty lies opportunity, Albert Einstein.",
                "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment, Ralph Waldo Emerson.",
                "The best way to predict the future is to invent it, Alan Kay.",
                "Success is not the key to happiness, happiness is the key to success, Albert Schweitzer.",
                "The journey of a thousand miles begins with one step, Lao Tzu.",
                "Do what you can, with what you have, where you are, Theodore Roosevelt.",
                "You miss 100% of the shots you don’t take, Wayne Gretzky.",
                "It does not matter how slowly you go as long as you do not stop, Confucius.",
                "Be not afraid of life, believe that life is worth living, and your belief will help create the fact, William James."
        };
    }
}
