# 🧭 Web Browser Navigation using Stack (Java)

This project simulates a basic web browser's navigation system — including visiting pages, going back, and moving forward — using a custom implementation of stack behavior via a **doubly linked list** in Java.

## 🚀 Features

- Visit new web pages (URLs)
- Navigate back to the previous page
- Navigate forward to the next page
- Show the current page being viewed
- Clears forward history when a new page is visited (just like real browsers!)

## 🧠 How it Works

- Each page visited is stored as a node in a doubly linked list.
- When you go back or forward, the pointer moves accordingly.
- If you visit a new page after going back, the forward history is cleared (mimicking real browser behavior).

## 🛠️ Code Structure

- `visit(String url)` – Visit a new webpage.
- `back()` – Go back to the previous page.
- `forward()` – Move forward to the next page (if any).
- `currentPage()` – Print the current page.
- `isEmpty()` – Check if any page has been visited yet.

## 📦 Example Usage

```java
StackInWebBrowsers browser = new StackInWebBrowsers();

browser.visit("https://google.com");
browser.visit("https://github.com");
browser.back();               // Goes back to Google
browser.forward();            // Goes forward to GitHub
browser.visit("https://openai.com"); // Clears forward history
browser.currentPage();        // Shows OpenAI
```
## 📚 Learning Outcome

This project is great for:
-Understanding stack and browser history behavior
-Practicing doubly linked list implementation
-Enhancing object-oriented programming skills in Java

## 📁 File

-`StackInWebBrowsers.java` — contains the main implementation
-`StackInWebBrowsersDriver.java` — contains all the driver implementation

Feel free to connect!
📌 Author: Devansh
📅 mail: devanshdmp15@gmail.com
