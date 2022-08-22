
# Week 1 - HTML Assignment

## Exercise 1.1
**When a user enters an URL in the browser, how does the browser fetch the desired result? Explain this with the below in mind and Demonstrate this by drawing a diagram for the same.**

### Explanation

<p> Internet is Global system of interconnected computer networks that uses the 
Internet Protocol suite(TCP/IP) to communicate between networks and devices. </p>

<p> With web we dont just mean websites but any interaction with a computer called
server and we are communicating with that server and get data present on the internet. To get access to this networks, we use an interface called browser.</p>

<p>
Lets see how a browser works.
</p>

<details>
    <summary>Main functionality of the browser</summary>

<p>
    Let's take the most common scenario that we are visiting a web page like youtube.com. So we open up our browser and enter https://www.youtube.com. Now on the backend side, any website needs to be stored somewhere from where anyone could access them with some URL links. So the data center servers works as a storage centers. Now when ever we request youtube.com, server returns some UI files (HTML, CSS, JS) and some client side processing files (JS) to your browser(client). Because browser in the end is just an interpreter which gets some source code and it can display it on the screen.
</p>

<p>
    But now the question is how does the servers know what data or web page are we requesting. So here is where DNS and IP addresses plays a role. Every webpage has its address, more commonly known as IP address. This IP address points to a location in the network at a server. So to get this address, our browser contacts a DNS (Domain Name System) server. DNS is like a huge dictionary and has key-value pairs. Key as the domain name or URL and value as an IP address. On request from the browser, this IP address is returned to the browser.
</p>

<p>
    Now the browser goes to server with this IP address via our router and TCP/IP (Trasmission Control Protocol/Internet Protocol). And how so ever the website is developed, processes takes place in server side and the resultant files are returned to the browser. If the website has dynamic approaches, then an end-to-end encrypted connection is formed between client side and server side with https(Hypertext Transfer Protocol Secure).
</p>

Browsing Process:

1. Browser reuest DNS server for URLs' IP address
2. DNS returns browser an IP address
3. Browser requests network/server for files present on IP address
4. Server returns browser with the HTML, CSS and JS files
5. Rendering engine and JS interpreter displays webpage on the display area of browser

[![functionbrowser-func.png](https://i.postimg.cc/ydt5Fg6B/functionbrowser-func.png)](https://postimg.cc/34jnhwDb)

<p>
    Lets take a deeper look into involved techs and what source code does a broswer gets from a server. Browser gets a combination of HTML CSS and JS. These are the three technologies involved into getting the screen what we see. HTML (Hypertext Markup Language) and it gives a web page a skeleton and is written in a standardized tags representing different components of a website. Like header, footer, images, sections, etc. Css (Cascading Style Sheet) gives the styles/looks to a webpage like colors, animations, margin, padding, etc. And then comes JS (JavaScript) which brings in all the logic to the UI and all the dynamic mobility of code. For eg. events like onclick drop-downs, generating product cards on e-commerce webpages, etc. Now if the page is generated dynamically on the server side, then there need to be some code that runs on the server side. This is done by the techs like NodeJs, PHP, etc. There are some frameworks like ReactJs, VueJs, AngularJs, which makes parsing incoming requests easier and we get a finished parsed data. There are also some new techs for real time communication where we dont have request-response but server actively push a new message to the client so client never sent a request but gets new data anyways through a tech named WebSockets.
</p>


</details>


<details>
    <summary>High level components of a browser</summary>

    1. User Interface
    2. Browser engine (Server <-> Rendering engine)
    3. Rendering engine (HTML, CSS -> Webpage)
    4. JS interpreter
    5. Network (Server -> Browser engine)
    6. Data storage (cookies and local storage)

[![Componentsbrowser-comp-2.png](https://i.postimg.cc/mZcWtRZB/Componentsbrowser-comp-2.png)](https://postimg.cc/mhG55vF5)

</details>


<details>
    <summary>Rendering Engine</summary>

[![Funnelrender-engine.png](https://i.postimg.cc/QMh06DvW/Funnelrender-engine.png)](https://postimg.cc/nXS4zyFH)

<p>
    Rendering Engine reads HTML and constructs a DOM content tree made up of DOM nodes. Nodes can be images, text blocks, buttons, lists, etc. Render engine gets data from a server of the network. With the styling components (CSS), a new rendered tree called CSSOM is formed. Then DOM tree and CSSOM tree forms a render tree and it goes through a layout process where each node is positioned on the screen with coordinates. The rendered tree is then traversed with each node painted using the UI backend layer. When the parsing process is finished the browser will mark the document as interactive and allow us(the user) to interact with the nodes on the page.
</p>

[![render-tree.jpg](https://i.postimg.cc/T2ZdK2yx/render-tree.jpg)](https://postimg.cc/kDv3ZmFY)

<p>
    Different browsers use different render engines. Like Chrome and Opera uses Blink and Firefox uses Gecko.
</p>

Rendering Process:

1. Process HTML markup and build a DOM tree
2. Process CSS markup and build the CSSOM tree
3. Combine DOM and CSSOM into a render tree
4. Run layout on display of the render tree to compute the geometry of each node
5. Paint the individual nodes on the screen.


</details>


<details>
    <summary>Layout, Painting and Compositing</summary>

<p>
    Once everthing we got from server is rendered by engines, its time to display webpage on the display area. To do that we go through layout, painting and compositing.
</p>

<p>
Layout: </br>
    Layout will position element on the display with respect to coordinates of the display area. These displayed part will be just an empty boxes positioned as requested by the render tree.
</p>

<p>
Painting: </br>
    Before we had theoritical objects, and after we assign coordinates to elements, its now time to provide them with colors. All types of CSS properties assigned to HTML elements, gets respective styles. Painting colourizes all the pixels of the display area.
</p>

[![Screenshot-2022-08-21-003953.png](https://i.postimg.cc/ht3dfNDX/Screenshot-2022-08-21-003953.png)](https://postimg.cc/bZkJ5C2P)

<p>
Compositing:  </br>
    Compositing is about only opacity and transform. These are two kind of special CSS properties. For eg when we want to to make a button bigger when hovered over it, it will typically mean we would have to layout and paint display again if we chose traditional way. But doing that every time will degrade the performance of our site. To over come this, compositing is used by the browser. Compositing creates a blank texture using coordinates to where will the hovered button grow and just changes the colour of texture to button color to bring in the desired transformations. While layout and painting is handled by CPU, compositing is handled by GPU, which makes it even more faster without actually changing the layout of other elements.
</p>

<p>
Performance optimization: </br>
    Layout is quite long process, painting is even longer, reason why pages sometime are frozen for loading. Compositing also takes a bit of time, as it create textures and then send it to GPU. Changing element without compositing techniques will keep changing entire layout and paint again and again, so its better to use compositing techniques (transform and opacity) for better performances.
</p>

[![download.png](https://i.postimg.cc/VkT8SW3f/download.png)](https://postimg.cc/RWc8yKSy)
</details>

