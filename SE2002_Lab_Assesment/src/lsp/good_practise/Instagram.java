public class Instagram implements ChatApp, StoryPoster {
    @Override
    public void chat() {
        System.out.println("Chatting...");
    }

    @Override
    public void postStory() {
        System.out.println("Story posted!");
    }
}