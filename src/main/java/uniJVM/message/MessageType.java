package uniJVM.message;

/**
 * <h1>MessageType</h1>
 *
 * <p>Message types.</p>
 *
 * under developing
 * <p>For instructional purposes only.  No warranties.</p>
 */
public enum MessageType
{
    SOURCE_LINE, SYNTAX_ERROR,
    PARSER_SUMMARY, INTERPRETER_SUMMARY, COMPILER_SUMMARY,
    MISCELLANEOUS, TOKEN,
    ASSIGN, FETCH, BREAKPOINT, RUNTIME_ERROR,
    CALL, RETURN,
}
