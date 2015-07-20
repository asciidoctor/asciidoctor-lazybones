def props = [:]

props.title = ask("What is the title of your presentation ?: ", "", "title")
props.deckjsTheme = ask("Which theme do you want to use [none]?: ", "none", "deckjsTheme")
props.author = ask("Who is the author [firstname lastname <email>]?: ", "", "author")

processTemplates('**/*', props)
