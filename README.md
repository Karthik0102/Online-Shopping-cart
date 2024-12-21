Shopping Cart Application

Overview
The Shopping Cart Application is a console-based Java program that simulates an online shopping experience. Users can browse products, add items to a cart, adjust quantities, view their cart, and checkout with a calculated total cost.
Features
View Products: Display a list of available products with details such as ID, name, price, and available stock.
Add to Cart: Add a product to the cart by specifying its ID and desired quantity.
Remove from Cart: Remove a product or adjust its quantity in the cart.
View Cart: View items in the cart, including product details, quantities, and total cost.
Checkout: Complete the purchase and display the total amount.
Exit: Exit the application.

How It Works
Classes and Responsibilities

ShoppingApplication
Acts as the main driver of the application.
Manages user interaction through a menu-driven interface.
Delegates functionality to relevant classes such as Cart and Product.

Product
Represents a product with attributes: id, name, price, and quantity (available stock).
Includes methods to check stock availability and adjust stock levels.

Cart
Contains a list of CartItem objects representing the products added to the cart.
Handles adding, removing, and updating cart items.
Calculates the total cost of items in the cart.

CartItem
Represents a single product in the cart along with its quantity.
Includes methods to increase or decrease the quantity and calculate the total price for that item.

Getting Started

Prerequisites
Java Development Kit (JDK) 8 or higher.
A Java IDE or text editor (e.g., Eclipse, IntelliJ IDEA, or VS Code).

Installation
Clone the repository or download the source code.
Open the project in your preferred IDE.
Ensure all source files (ShoppingApplication, Product, Cart, CartItem) are in the correct package structure.
Run the ShoppingApplication class to start the application.
Usage

Application Menu
View Products: Displays a list of all available products.
Add to Cart: Prompts for product ID and quantity, then adds the product to the cart.
Remove from Cart: Prompts for product ID and quantity to remove from the cart.
View Cart: Shows all items in the cart, including their details and total cost.
Checkout: Displays the total cost, clears the cart, and thanks the user for their purchase.
Exit: Exits the application.

Example Flow

Start the application.
View the product catalog.
Add a product to the cart (e.g., 5 headphones).
View the cart to verify items.
Remove 1 headphone from the cart.
Checkout and complete the purchase.
Exit the application.

Known Issues
Removing more quantity than exists in the cart may not prompt an error; ensure user input is validated.

Future Improvements
Add user authentication for a personalized shopping experience.
Implement persistence to save cart details between sessions.
Create a graphical user interface (GUI) for enhanced usability.
Add discount codes and promotions.
Allow updating product catalog dynamically.

