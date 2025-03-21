Ahead-of-Time (AOT) Class Loading & Linking 🚀
(Using GraalVM ココと)

🔹 Linking / Loading: After compiling, the JVM loads .class files into memory and links them before execution.

🔹 Traditional Java Execution:

Classes are loaded & linked at runtime, causing startup delays.
🔹 With AOT:

Some parts of the bytecode are pre-linked & preloaded before execution.
Faster startup, reduced JIT compilation overhead, and less work needed at app start.