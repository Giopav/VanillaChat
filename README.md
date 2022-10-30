# VanillaChat
This Minecraft plugin just modifies player-sent messages, it may not work with other plugins that handle chat messages (as some plugins just remove the player-sent message with a server-sent message disguised as one).

If you don't know what Legacy and MiniMessage formatting is, I suggest you read [Kyori adventure's documentation](https://docs.adventure.kyori.net/index.html) as it is very well-made and satisfying to read.

I just want to explain what the plugin does:

## 	Legacy message
As for the Legacy messages, like "&6Hello &b&lworld&c!", the legacy tags[^1] are caught and replaced by its colored counterpart. In this example the part of the string "Hello " would be colored in orange, "world" would be light blue and bold, and the exclamation point "!" would just be red (not dark red).

Some Legacy examples:

- &6Hello &b&lworld&c!
- &4&l&m&nREEEEED&r and &6&l&m&nORAAANGE&r!
- &4U&cn&6l&ei&ak&2e &1t&9h&3e &bo&dt&5h&4e&cr &6m&ee&as&2s&1a&9g&3e&bs&d, &5I &4a&cm &6c&eh&ai&2l&1l&9.

![image](https://user-images.githubusercontent.com/43653262/197389291-71876389-5c72-42bb-ae06-aa6be2c021ec.png)

## MiniMessage
If a string is not a Legacy message, it will be handled as a MiniMessage, even if it doesn't have any tags inside.

For MiniMessages, strings like "\<color:#44BBA4\>This \<gradient:#44BBA4:#E7BB41\>is my very own message\<color:red\>!" are rendered with the respective color.

Some MiniMessage examples:

- \<color:#44BBA4\>This \<gradient:#44BBA4:#E7BB41\>is my very own message\<color:red\>!
- \<gradient:#B8D8BA:#D9DBBC\>Pretty text UwU \<gradient:#FCDDBC:#EF959D:#69585F\>||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
- \<rainbow\>Unlike the other messages, I am chill.\</rainbow\>

![image](https://user-images.githubusercontent.com/43653262/197390538-516f5745-ebf1-4ceb-b9ef-21062d92da66.png)

As a side note, I use the *brilliantly* made [coolors.co](https://coolors.co/generate) website to generate color palettes, **strikingly beautiful**.

[^1]: For legacy tags I mean parts of the string that start with & and are followed by any valid character (ex. &a, &7, &l, &r).
