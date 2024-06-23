Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
<br>
The pattern suggest that you link these handlers into a chain.
Each linked handler has a field for storing a reference to the next handler in the chain. In addition to processing a request, handlers pass the request further along the chain. The request travels along the chain until all handlers have had a chance to process it. The best part is: a handler can decide not to pass the request further down the chain and effectively stop any further processing.
<br>
Handlers are usually self-contained and immutable, accepting all necessary data just once via the constructor.
<br>
Note that a request can be sent to any handler in the chain; it doesn’t have to be the first one.
