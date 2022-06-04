package pl.allegro.tech.build.axion.release

class PushFailedException extends RuntimeException {

    PushFailedException(String message) {
        super(message)
    }

    @Override
    Throwable fillInStackTrace() {
    }
}
